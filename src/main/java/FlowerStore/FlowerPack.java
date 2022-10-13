package FlowerStore;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity){
        this.flower = flower;
        this.quantity = quantity;
    }
    public int getPrice(){
        return this.quantity * this.flower.getPrice();
    }
}
