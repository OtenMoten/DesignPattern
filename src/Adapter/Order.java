package Adapter;

import java.util.ArrayList;

public class Order extends ArrayList implements IOrder {

    @Override
    public void addPosition(Position newPosition) {
        add(newPosition);
    }

    @Override
    public void deletePositionByNumber(int positionNr) {
        remove(positionNr);

    }

}