package FlowerStore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public void add(FlowerPack flowerPack){
        this.flowerPacks.add(flowerPack);
    }

    public int getPrice(){
        int price = 0;
        for (FlowerPack pack: flowerPacks){
            price += pack.getPrice();
        }
        return price;
    }
}
