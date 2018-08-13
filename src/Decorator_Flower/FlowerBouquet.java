package Decorator_Flower;

public abstract class FlowerBouquet {

    protected String description;

    public String getDescription() {
        return this.description;
    }

    public abstract double getCost();
    
}

class RoseBouquet extends FlowerBouquet {

    public RoseBouquet() {
        this.description = "Rose Bouquet : 12 ";
    }

    @Override
    public double getCost() {
        return 12.0;
    }
    
}

class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        this.description = "Orchid Bouquet: 22  ";
    }

    @Override
    public double getCost() {
        return 22.0;
    }
    
}