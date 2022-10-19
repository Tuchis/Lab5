import flower.store.Flower;
import flower.store.FlowerBucket;
import flower.store.FlowerPack;
import flower.store.Rose;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerBucketTest {
    /**
     * FLowerbucket.
     */
    private FlowerBucket flowerBucket;
    /**
     * Const.
     */
    public static final int PRICE = 20;

    /**
     * BeforeEach.
     */
    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(PRICE);
        FlowerPack flowerPack = new FlowerPack(flower, PRICE);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    /**
     * Test1.
     */
    @Test
    public void testPrice() {
        int value = PRICE * PRICE;
        assertEquals(value, flowerBucket.getPrice());
    }

}
