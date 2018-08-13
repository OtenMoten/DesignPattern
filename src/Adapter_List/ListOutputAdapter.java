package Adapter_List;

import java.util.Collection;

interface IListOutput {
    public void showList(Collection<String> liste);
}

class ListOutputAdapter implements IListOutput {

    UpperCaseListOutput myUpperCaseListOutput;

    public ListOutputAdapter() {
        this.myUpperCaseListOutput = new UpperCaseListOutput();
    }

    @Override
    public void showList(Collection<String> inputList) {
        String[] myStringList = inputList.toArray(new String[inputList.size()]);
        this.myUpperCaseListOutput.showList(myStringList);
    }
}
