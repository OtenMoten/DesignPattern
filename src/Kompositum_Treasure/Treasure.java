package Kompositum_Treasure;

import java.util.ArrayList;
import java.util.List;

class Treasure implements Container {

    private List<Container> container = new ArrayList<Container>();

    @Override
    public void getContent() {
        this.container.forEach((containerElement) -> {
            containerElement.getContent();
        });
    }

    public void put(Container containerElement) {
    	this.container.add(containerElement);
    }

    public void get(Container containerElement) {
    	this.container.remove(containerElement);
    }
    
}