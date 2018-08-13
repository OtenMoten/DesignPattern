package Kompositum_Kiste;

public class Kompositum {

    public static void main(String[] args) {

        Box box_1 = new Box(), box_2 = new Box(),
                box_3 = new Box(),
                box_4 = new Box();

        Can can_1 = new Can(), can_2 = new Can(), can_3 = new Can();

        Treasure mainTreasure = new Treasure();
        Treasure treasure_1 = new Treasure(), treasure_2 = new Treasure();

        treasure_1.put(box_1);
        treasure_1.put(box_2);
        treasure_2.put(box_3);
        treasure_2.put(box_4);
        treasure_2.put(can_1);
        treasure_2.put(can_2);
        treasure_2.put(can_3);

        mainTreasure.put(treasure_1);
        mainTreasure.put(treasure_2);
        
        mainTreasure.getContent();
        
        treasure_2.get(can_3);

        mainTreasure.getContent();

    }

}