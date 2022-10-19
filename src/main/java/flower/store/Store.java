package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    /**
     * Store class
     */
    private List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();

    public Store() {
    }

    /**
     * Add
     *
     * @param flowerBucket
     */
    public void add(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    /**
     * Search function
     *
     * @param flowerSpec
     * @return boolean
     */
    public boolean search(FlowerSpec flowerSpec) {
        for (FlowerBucket flowerBucket : flowerBuckets) {
            if (flowerBucket.isDesirable(flowerSpec)) {
                return true;
            }
        }
        return false;
    }
}
