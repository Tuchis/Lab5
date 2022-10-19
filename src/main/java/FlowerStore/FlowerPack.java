package FlowerStore;

public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int quantity){
        this.flower = flower;
        this.amount = quantity;
    }
    public String getType(){return this.flower.getClass().getSimpleName();};
    public int getPrice(){
        return this.amount * this.flower.getPrice();
    }
    public String getColor(){
        return this.flower.getColor();
    }
    public int getAmount(){
        return this.amount;
    }
}
