package Decorator_Flower;

public abstract class FlowerBouquetDecorator extends FlowerBouquet {
    //public abstract String getDescription();
}

class Glitter extends FlowerBouquet //extends FlowerBouquetDecorator
{

    private FlowerBouquet flowerBouquet;

    public Glitter(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + "  +4";
    }

    @Override
    public double getCost() {
        return 4 + flowerBouquet.getCost();
    }

}

class PaperWrapper extends FlowerBouquet {

    FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + "  +3";
    }

    @Override
    public double getCost() {
        return 3 + flowerBouquet.getCost();
    }

}

class RibbonBow extends FlowerBouquet {

    FlowerBouquet flowerBouquet;

    public RibbonBow(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + "  +8";
    }

    @Override
    public double getCost() {
        return 8 + flowerBouquet.getCost();
    }

}