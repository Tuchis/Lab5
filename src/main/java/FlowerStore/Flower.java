package FlowerStore;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Flower {
    private int price;
    private int sepalLength;
    private FlowerColor color;

    public String getColor(){
        return color.getColor();
    }
}

