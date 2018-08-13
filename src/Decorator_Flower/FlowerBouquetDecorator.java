package Decorator_Flower;

public abstract class FlowerBouquetDecorator extends FlowerBouquet {
    @Override
    public abstract String getDescription();
}

class Glitter extends FlowerBouquetDecorator {

    private final FlowerBouquet flowerBouquet;

    public Glitter(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return this.flowerBouquet.getDescription() + "  +4";
    }

    @Override
    public double getCost() {
        return 4 + this.flowerBouquet.getCost();
    }

}

class PaperWrapper extends FlowerBouquet {

    FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return this.flowerBouquet.getDescription() + "  +3";
    }

    @Override
    public double getCost() {
        return 3 + this.flowerBouquet.getCost();
    }

}

class RibbonBow extends FlowerBouquet {

    FlowerBouquet flowerBouquet;

    public RibbonBow(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return this.flowerBouquet.getDescription() + "  +8";
    }

    @Override
    public double getCost() {
        return 8 + this.flowerBouquet.getCost();
    }

}