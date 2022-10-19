import flower.store.Flower;
import flower.store.FlowerColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerTest {
    /**
     * Flower.
     */
    private Flower flower;

    /**
     * Init.
     */
    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    /**
     * TestPrice.
     */
    @Test
    public void testPrice() {
        int price = 20;
        flower.setPrice(price);
        assertEquals(price, flower.getPrice());
    }

    /**
     * TestColor.
     */
    @Test
    public void testColor() {
        FlowerColor price = FlowerColor.RED;
        flower.setColor(price);
        assertEquals("#FF0000", flower.getColor());
    }
}
