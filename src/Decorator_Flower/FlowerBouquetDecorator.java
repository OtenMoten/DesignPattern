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

    public String getDescription() {
        return flowerBouquet.getDescription() + "  +4";
    }

    public double cost() {
        return 4 + flowerBouquet.cost();
    }

}

class PaperWrapper extends FlowerBouquet {

    FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    public String getDescription() {
        return flowerBouquet.getDescription() + "  +3";
    }

    public double cost() {
        return 3 + flowerBouquet.cost();
    }

}

class RibbonBow extends FlowerBouquet {

    FlowerBouquet flowerBouquet;

    public RibbonBow(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    public String getDescription() {
        return flowerBouquet.getDescription() + "  +8";
    }

    public double cost() {
        return 8 + flowerBouquet.cost();
    }

}
