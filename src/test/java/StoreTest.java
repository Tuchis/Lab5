import flower.store.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreTest {
    private Store store;

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

    @Test
    public void testSearch() {
        FlowerSpec flowerSpec = new FlowerSpec(10, FlowerColor.BLUE, Arrays.asList("Rose", "Tulip"));
        assertEquals(true, store.search(flowerSpec));
    }

    @Test
    public void testSearch_fail() {
        FlowerSpec flowerSpec = new FlowerSpec(20, FlowerColor.BLUE, Arrays.asList("Rose", "Tulip"));
        assertEquals(false, store.search(flowerSpec));

        flowerSpec = new FlowerSpec(10, FlowerColor.RED, Arrays.asList("Rose", "Tulip"));
        assertEquals(false, store.search(flowerSpec));

        flowerSpec = new FlowerSpec(10, FlowerColor.BLUE, Arrays.asList("Chamomile"));
        assertEquals(false, store.search(flowerSpec));
    }


//    @Test
//    public void testColor() {
//        FlowerColor price = FlowerColor.RED;
//        flower.setColor(price);
//        assertEquals("#FF0000", flower.getColor());
//    }
}