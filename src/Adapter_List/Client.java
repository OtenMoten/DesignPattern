package Adapter_List;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        IListOutput objListOutput = new ListOutputAdapter();

        ArrayList<String> myArrayList = new ArrayList<>();

        myArrayList.add("Text_1");
        myArrayList.add("Text_2");
        myArrayList.add("Text_3");
        myArrayList.add("Text_4");

        objListOutput.showList(myArrayList);
        
    }
    
}