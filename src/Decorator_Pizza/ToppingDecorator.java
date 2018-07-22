// Has a "Has a" relationship with Pizza, this is an "Aggregation Relationship".

package Decorator_Pizza;

abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;
	
    // Assigns the type instance to this attribute of a Pizza.
	
    // All decorators can dynamically customize the Pizza
    // instance PlainPizza because of this.
	
    public ToppingDecorator(Pizza newPizza){	
        tempPizza = newPizza;	
    }
	
    @Override
    public String getDescription() {	
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
	
}