package Decorator_GUI;

import java.awt.Color;
import java.awt.Graphics;

public class LinesDecorator extends JComponentDecorator {

    int numberOfLines = 1;

    public LinesDecorator(int newNumberOfLines, Color newLinesColor) {

        if (newNumberOfLines > 1) {
            this.numberOfLines = newNumberOfLines;
        }

        if (newLinesColor == null) {
            newLinesColor = Color.black;
        }

        setBackground(newLinesColor);

    }

    @Override
    protected void paintComponent(Graphics newGraphicsObject) {
        
        int delta = getHeight() / (this.numberOfLines + 1);
        newGraphicsObject.setColor(getBackground());

        int yCoordinate = delta;
        for (int i = 0; i < this.numberOfLines; i++) {
            newGraphicsObject.drawLine(0, yCoordinate, getWidth(), yCoordinate);
            yCoordinate += delta;
        }
        
    }
    
}