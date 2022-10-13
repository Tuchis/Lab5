package FlowerStore;

public enum FlowerColor {

    RED("#FF0000"),
    GREEN ("#00FF00"),
    BLUE ("#0000FF");
    private String color;

    FlowerColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
