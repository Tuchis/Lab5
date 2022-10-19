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
     * Const 1.
     */
    public static final int CONST_TWEN = 20;
    /**
     * Const 2.
     */
    public static final int CONST_TEN = 10;

    /**
     * Init of tests.
     */
    @BeforeEach
    public void init() {
        store = new Store();
        Flower flower = new Rose();
        flower.setPrice(CONST_TWEN);
        flower.setColor(FlowerColor.BLUE);
        FlowerPack flowerPack = new FlowerPack(flower, CONST_TEN);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        store.add(flowerBucket);
    }

    /**
     * TestSearch.
     */
    @Test
    public void testSearch() {
        FlowerSpec flowerSpec = new FlowerSpec(CONST_TEN,
                FlowerColor.BLUE, Arrays.asList("Rose", "Tulip"));
        assertEquals(true, store.search(flowerSpec));
    }

    /**
     * TestSearchFail.
     */
    @Test
    public void testSearch_fail() {
        FlowerSpec flowerSpec = new FlowerSpec(CONST_TWEN,
                FlowerColor.BLUE, Arrays.asList("Rose", "Tulip"));
        assertEquals(false, store.search(flowerSpec));

        flowerSpec = new FlowerSpec(CONST_TEN, FlowerColor.RED,
                Arrays.asList("Rose", "Tulip"));
        assertEquals(false, store.search(flowerSpec));

        flowerSpec = new FlowerSpec(CONST_TEN, FlowerColor.BLUE,
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