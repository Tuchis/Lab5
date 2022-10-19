import flower.store.Flower;
import flower.store.FlowerBucket;
import flower.store.FlowerPack;
import flower.store.Store;
import flower.store.FlowerColor;
import flower.store.FlowerSpec;
import flower.store.Rose;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreTest {
    /**
     * StoreTest.
     */
    private Store store;

    /**
     * Init of tests.
     */
    @BeforeEach
    public void init() {
        store = new Store();
        Flower flower = new Rose();
        flower.setPrice(20);
        flower.setColor(FlowerColor.BLUE);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        store.add(flowerBucket);
    }

    /**
     * TestSearch.
     */
    @Test
    public void testSearch() {
        FlowerSpec flowerSpec = new FlowerSpec(10,
                FlowerColor.BLUE, Arrays.asList("Rose", "Tulip"));
        assertEquals(true, store.search(flowerSpec));
    }

    /**
     * TestSearchFail.
     */
    @Test
    public void testSearch_fail() {
        FlowerSpec flowerSpec = new FlowerSpec(20,
                FlowerColor.BLUE, Arrays.asList("Rose", "Tulip"));
        assertEquals(false, store.search(flowerSpec));

        flowerSpec = new FlowerSpec(10, FlowerColor.RED,
                Arrays.asList("Rose", "Tulip"));
        assertEquals(false, store.search(flowerSpec));

        flowerSpec = new FlowerSpec(10, FlowerColor.BLUE,
                Arrays.asList("Chamomile"));
        assertEquals(false, store.search(flowerSpec));
    }


//    @Test
//    public void testColor() {
//        FlowerColor price = FlowerColor.RED;
//        flower.setColor(price);
//        assertEquals("#FF0000", flower.getColor());
//    }
}