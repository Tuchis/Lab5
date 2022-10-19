package flower.store;

public enum FlowerColor {
    /**
     * Red color.
     */
    RED("#FF0000"),
    /**
     * Green color.
     */
    GREEN("#00FF00"),
    /**
     * Blue color.
     */
    BLUE("#0000FF");
    /**
     * Color.
     */
    private String color;

    /**
     * Init of FlowerColor.
     *
     * @param color
     */
    FlowerColor(final String color) {
        this.color = color;
    }

    /**
     * Get color.
     *
     * @return String
     */
    public String getColor() {
        return this.color;
    }
}
