package Multiton;

import java.util.ArrayList;
import java.util.List;

public class Multiton {

    // Attributes partially are static, this is the keypoint of the "Multiton" design pattern.
    private static final int limitOfInstances = 4;
    private static final List<Multiton> listOfInstances = new ArrayList<>();
    private static int instanceCounter = 0;
    private int instanceID;

    private Multiton() {}

    public static synchronized Multiton getInstance() {

        Multiton objMultitonInstance = null;

        if (listOfInstances.size() == limitOfInstances) {
            instanceCounter = 0;
        } else {
            objMultitonInstance = new Multiton();
            objMultitonInstance.instanceID = instanceCounter + 1;
            listOfInstances.add(objMultitonInstance);
            instanceCounter++;
        }

        return objMultitonInstance;
    
    }

    public int getInstanceID() {
        return this.instanceID;
    }
    
    // For testing purposes only.
    @Override
    public String toString() {
        return "Multiton Number: " + getInstanceID();
    }

}