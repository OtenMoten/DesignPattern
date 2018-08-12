package Decorator_Flower;

public class FlowerMaker {

    public static void main(String[] args) {

        FlowerBouquet rosebouquet = new RoseBouquet();
        
        System.out.println(rosebouquet.getDescription() + " = " + rosebouquet.getCost());

        FlowerBouquet orchidBouquet = new OrchidBouquet();

        // Do glitter on it
        Glitter glitter = new Glitter(orchidBouquet);
        orchidBouquet = glitter;
        // Do again glitter on it
        orchidBouquet = new Glitter(orchidBouquet);

        PaperWrapper paperWrapper = new PaperWrapper(orchidBouquet);
        orchidBouquet = paperWrapper;

        System.out.println(orchidBouquet.getDescription() + " = " + orchidBouquet.getCost());

    }

}
