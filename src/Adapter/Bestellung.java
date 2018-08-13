package Adapter;

import java.util.ArrayList;

public class Bestellung extends ArrayList implements IBestellung {

    @Override
    public void newPosition(Position newPosition) {
        add(newPosition);
    }

    @Override
    public void delPositionByNumber(int positionNr) {
        remove(positionNr);

    }

}