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
import java.util.ArrayList;

public class Department {

    private final ArrayList<Employee> myEmployeeList = new ArrayList<>();
    char departmentID;
    String nameOfDepartment;

    Department(char newID, String newDeparment) {
        this.departmentID = newID;
        this.nameOfDepartment = newDeparment;
    }

    public boolean addEmployee(Employee newEmployee) {
        return myEmployeeList.add(newEmployee);
    }

    @Override
    public String toString() {
        return "Department '" + this.departmentID + "' has " + this.nameOfDepartment
                + " " + myEmployeeList + " as workers.";
    }

}
