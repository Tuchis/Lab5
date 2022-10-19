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
    public static int CONST = 10;

    /**
     * BeforeEach.
     */
    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(CONST);
        FlowerPack flowerPack = new FlowerPack(flower, CONST);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    /**
     * Test1.
     */
    @Test
    public void testPrice() {
        int value = CONST * 10;
        assertEquals(value, flowerBucket.getPrice());
    }

}
