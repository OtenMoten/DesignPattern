package Kompositum;

class Leaf extends Component {
	
    public Leaf(String blattName){
       	super.komponentenName = blattName;
    }

    @Override
    public void aktualisiere() {
	tueEtwas();
    }
    
}