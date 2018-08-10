package Decorator_Flower;

public abstract class FlowerBouquet {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

class RoseBouquet extends FlowerBouquet {

    public RoseBouquet() {
        description = "Rose Bouquet : 12 ";
    }

    public double cost() {
        return 12.0;
    }
}

class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        description = "Orchid Bouquet: 22  ";
    }

    public double cost() {
        return 22.0;
    }
}
