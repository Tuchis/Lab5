package flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Flower {
    /*
    / Javadoc
    */
    private int price;
    /*
    / Javadoc
    */
    private int sepalLength;
    private FlowerColor color;
    /*
    / Flower class
    */
    public String getColor(){
        return color.getColor();
    }
}

