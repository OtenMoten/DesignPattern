/**
 * In this package you will learn how to deal with delegation.
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_Example_Beta;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.HashMap;

public class Firma {

    HashMap<Character, Department> map = new HashMap<>();
    private final String myFirma;

    public Firma(String newFirma) {
        this.myFirma = newFirma;
    }

    public void addDepartment(Department newDepartment) {
        this.map.put(newDepartment.departmentID, newDepartment);
    }

    @Override
    public String toString() {
        return this.map.toString();
    }

}
