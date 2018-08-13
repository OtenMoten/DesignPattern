package Adapter;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {

    public static void main(String[] args) {

        // Create a object that is type of the interface "IOrder".
        // Even though, we can't create a object of a interface but we
        // can create a object that is instanced by a child-class of "IOrder"
        // like the class "Order". But the object-type remains the
        // interface-type "IOrder".
        IOrder order = new Order();

        Position position_One = new Position(1, 123);
        Position position_Two = new Position(2, 456);
        
        order.addPosition(position_One);
        order.addPosition(position_Two);

        // We can cast the "bestellung"-object as "ArrayList" because
        // we instanced it as " ... new Order()".
        // The class "Order" extends the class "ArrayList" and
        // this is the reason why we can cast it as ArrayList.
        Iterator interator = ((ArrayList) order).iterator();

        while (interator.hasNext()) System.out.println(interator.next());
        
    }

}