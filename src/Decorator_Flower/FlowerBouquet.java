package Decorator_Flower;

public abstract class FlowerBouquet {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}

class RoseBouquet extends FlowerBouquet {

    public RoseBouquet() {
        description = "Rose Bouquet : 12 ";
    }

    @Override
    public double getCost() {
        return 12.0;
    }
}

class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        description = "Orchid Bouquet: 22  ";
    }

    @Override
    public double getCost() {
        return 22.0;
    }
}