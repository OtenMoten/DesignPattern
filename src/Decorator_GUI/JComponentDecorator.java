package Decorator_GUI;

import java.awt.Graphics;
import javax.swing.JComponent;

public abstract class JComponentDecorator extends JComponent {

    JComponent component;

    public void decorate(JComponent newComponentObject) {
        this.component = newComponentObject;
    }

    @Override
    public void paint(Graphics newGrahicsObect) {
        
        super.paint(newGrahicsObect);

        if (this.component != null) {
            this.component.setBounds(getBounds());
            this.component.paint(newGrahicsObect);
        }
        
    }
    
}