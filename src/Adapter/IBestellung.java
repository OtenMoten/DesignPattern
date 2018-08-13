package Adapter;

public interface IBestellung {

    abstract void newPosition(Position newPosition);

    abstract void delPositionByNumber(int positionNr);

}
