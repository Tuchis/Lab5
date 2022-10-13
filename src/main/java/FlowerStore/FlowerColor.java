package FlowerStore;

public enum FlowerColor {

    RED("#FF0000");
    private String color;

    FlowerColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
