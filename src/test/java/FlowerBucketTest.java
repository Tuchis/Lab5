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
     * BeforeEach.
     */
    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    /**
     * Test1.
     */
    @Test
    public void testPrice() {
        assertEquals(100, flowerBucket.getPrice());
    }

}
