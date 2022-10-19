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
     * Const.
     */
    public static final int PRICE = 20;

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
        flower.setPrice(PRICE);
        assertEquals(PRICE, flower.getPrice());
    }

    /**
     * TestColor.
     */
    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        assertEquals("#FF0000", flower.getColor());
    }
}
