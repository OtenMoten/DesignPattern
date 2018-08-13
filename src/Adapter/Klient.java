package Adapter;

import java.util.ArrayList;
import java.util.Iterator;

public class Klient {

    public static void main(String[] args) {

        // Create a object that is type of the interface "IBestellung".
        // Even though, we can't create a object of a interface but we
        // can create a object that is instanced by a child-class of "IBestellung"
        // like the class "Bestellung". But the object-type remains the
        // interface-type "IBestellung".
        IBestellung bestellung = new Bestellung();

        bestellung.newPosition(new Position(1, 123));
        bestellung.newPosition(new Position(2, 456));

        // We can cast the "bestellung"-object as "ArrayList" because
        // we instanced it as " ... new Bestellung()".
        // The class "Bestellung" extends the class "ArrayList" and
        // this is the reason why we can cast it as ArrayList.
        Iterator interator = ((ArrayList) bestellung).iterator();

        while (interator.hasNext()) System.out.println(interator.next());
        
    }

}