package Decorator_Flower;

public class FlowerMaker {

    public static void main(String[] args) {

        FlowerBouquet rosebouquet = new RoseBouquet();
        String rose = rosebouquet.getDescription();
        rose += " = " + rosebouquet.cost();
        System.out.println(rose);

        FlowerBouquet orchidBouquet = new OrchidBouquet();

        Glitter glitter = new Glitter(orchidBouquet);
        orchidBouquet = glitter;
        orchidBouquet = new Glitter(orchidBouquet);

        PaperWrapper pw = new PaperWrapper(orchidBouquet);
        orchidBouquet = pw;

        String orchid = orchidBouquet.getDescription();
        orchid += " = " + orchidBouquet.cost();
        System.out.println(orchid);

    }

}
