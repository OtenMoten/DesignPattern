package Decorator_GUI;

import java.awt.Color;

public class Klient {

    public static void main(String[] args) {

        GUI mainGUI = new GUI();
        JComponentDecorator lindecoBlue = new LinesDecorator(3, Color.BLUE);
        mainGUI.mainFrame.add(lindecoBlue);
        mainGUI.mainFrame.setVisible(true);

        JComponentDecorator lindecoRed = new LinesDecorator(14, Color.red);
        mainGUI.mainFrame.add(lindecoRed);
        mainGUI.mainFrame.setVisible(true);

    }

}