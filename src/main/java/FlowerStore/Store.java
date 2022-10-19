package FlowerStore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();

    public Store(){}

    public void add(FlowerBucket flowerBucket){
        flowerBuckets.add(flowerBucket);
    }

    public boolean search(FlowerSpec flowerSpec){
        for (FlowerBucket flowerBucket: flowerBuckets){
            if (flowerBucket.isDesirable(flowerSpec)){
                return true;
            }
        }
        return false;
    }
}
