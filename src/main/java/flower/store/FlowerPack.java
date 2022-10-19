package flower.store;

public class FlowerPack {
    /**
     * FLowerPack class
     */
    private Flower flower;
    private int amount;

    /**
     * FlowerPack init
     *
     * @param flower
     * @param quantity
     */
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.amount = quantity;
    }

    /**
     * Gettype
     *
     * @return String
     */
    public String getType() {
        return this.flower.getClass().getSimpleName();
    }

    ;

    /**
     * Getprice
     *
     * @return int
     */
    public int getPrice() {
        return this.amount * this.flower.getPrice();
    }

    /**
     * Getcolor
     *
     * @return String
     */
    public String getColor() {
        return this.flower.getColor();
    }

    /**
     * Getamount
     *
     * @return int
     */
    public int getAmount() {
        return this.amount;
    }
}
