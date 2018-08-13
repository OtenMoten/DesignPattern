package Decorator_GUI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class GUI {

    public JFrame mainFrame;

    public GUI() {
        
        this.mainFrame = new JFrame();
        this.mainFrame.setTitle("Example LinesDecorator");
        this.mainFrame.setBounds(300, 200, 600, 400);
        
        this.mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEventObject) {
                System.exit(0);
            }
        });

        this.mainFrame.setVisible(true);

    }

}