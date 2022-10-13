import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Flower {
    private int price;
    private FlowerColor color;

    public String getColor(){
        return color.getColor();
    }
}

public enum FlowerColor {

    RED ("#FF0000");
    private String color;
    FlowerColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
}
