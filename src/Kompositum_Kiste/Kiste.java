package Kompositum_Kiste;

import java.util.ArrayList;
import java.util.List;

class Kiste implements Container {

    private List<Container> container = new ArrayList<Container>();

    @Override
    public void enthalte() {
        container.forEach((containerElement) -> {
            containerElement.enthalte();
        });
    }

    public void legeRein(Container containerElement) {
    	container.add(containerElement);
    }

    public void nimmRaus(Container containerElement) {
    	container.remove(containerElement);
    }
    
}