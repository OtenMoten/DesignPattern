package Adapter_List;

public class UpperCaseListOutput {

    public void showList(String[] inputList) {
        for (String listElement : inputList) {
            System.out.println(listElement.toUpperCase());
        }
    }
    
}