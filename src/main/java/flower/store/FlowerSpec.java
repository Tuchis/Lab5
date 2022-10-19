package flower.store;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class FlowerSpec {
    /**
     * FlowerSpec
     */
    private int amount;
    private FlowerColor color;
    private List<String> flowersTypes = new ArrayList<String>();

    /**
     * GetColor
     *
     * @return String
     */
    public String getColor() {
        return color.getColor();
    }

    /**
     * FlowerSpec init
     *
     * @param amount
     * @param color
     * @param flowersTypes
     */
    public FlowerSpec(int amount, FlowerColor color, List<String> flowersTypes) {
        this.amount = amount;
        this.color = color;
        this.flowersTypes = flowersTypes;
    }
}
