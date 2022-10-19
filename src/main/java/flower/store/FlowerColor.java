package flower.store;

public enum FlowerColor {
    /**
     * FLowerColor enum
     */
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");
    private String color;

    /**
     * Init of FlowerColor
     *
     * @param color
     */
    FlowerColor(String color) {
        this.color = color;
    }

    /**
     * Get color
     *
     * @return String
     */
    public String getColor() {
        return this.color;
    }
}
