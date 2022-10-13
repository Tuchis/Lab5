import FlowerStore.*;
public class Main {
    public static void main(String[] args) {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        System.out.println(flowerBucket.getPrice());
    }
}
