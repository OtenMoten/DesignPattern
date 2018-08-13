package Adapter;

public class Position {

    int positionNr;
    int artikelNr;

    public Position(int newPositionNr, int newArtikelNr) {
        this.positionNr = newPositionNr;
        this.artikelNr = newArtikelNr;
    }

    @Override
    public String toString() {
        return "posNr: " + this.positionNr + "  ArtikelNr: " + this.artikelNr;
    }
    
}