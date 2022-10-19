package FlowerStore;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class FlowerSpec {
    private int amount;
    private FlowerColor color;
    private List<String> flowersTypes = new ArrayList<String>();

    public String getColor() {
        return color.getColor();
    }

    public FlowerSpec(int amount, FlowerColor color, List<String> flowersTypes){
        this.amount = amount;
        this.color = color;
        this.flowersTypes = flowersTypes;
    }
}
