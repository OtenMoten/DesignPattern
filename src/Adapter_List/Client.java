package Adapter_List;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        IListOutput objListOutput = new ListOutputAdapter();

        ArrayList<String> myArrayList = new ArrayList<>();

        myArrayList.add("Auf der Mauer");
        myArrayList.add("auf der Lauer");
        myArrayList.add("sitzt ne kleine Wanze");
        myArrayList.add("seht euch mal die Wanze an!");

        objListOutput.showList(myArrayList);
    }
    
}