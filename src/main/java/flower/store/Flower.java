package flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Flower {
    /**
     * Flower class
     */
    private int price;
    /**
     * Price and sepallength
     */
    private int sepalLength;
    /**
     * Color of flower
     */
    private FlowerColor color;

    /**
     * Getcolor
     * @return String
     */
    public String getColor(){
        return color.getColor();
    }
}

