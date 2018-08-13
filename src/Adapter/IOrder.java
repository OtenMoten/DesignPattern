package Adapter;

public interface IOrder {

    abstract void addPosition(Position newPosition);

    abstract void deletePositionByNumber(int positionNr);

}
