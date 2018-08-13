package Adapter;

public class Position {

    int positionNr;
    int itemNr;

    public Position(int newPositionNr, int newArtikelNr) {
        this.positionNr = newPositionNr;
        this.itemNr = newArtikelNr;
    }

    @Override
    public String toString() {
        return "On position #" + this.positionNr + " is Item #" + this.itemNr + ".";
    }
    
}