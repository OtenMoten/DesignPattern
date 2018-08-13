// StrukturAufgabe_5
package Enum;

import Enum.IExpTree.Operations;

public class Main {

    public static void main(String[] args) {

        ValueNode myValueNode = new ValueNode(100.0d);
        
        System.out.println(myValueNode.calculate());
        
        for(Operations op : IExpTree.Operations.values()) System.out.println(op);
        
    }

}