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
public class Main {

    public static void main(String[] args) {

        Employee Karl = new Employee("Karl");
        Employee Nadine = new Employee("Nadine");
        Employee Jens = new Employee("Jens");

        Firma myFirma = new Firma("Meine Firma");

        myFirma.addDepartment(new Department('e', "Department E"));
        myFirma.addDepartment(new Department('v', "Department V"));
        myFirma.map.get('v').addEmployee(Karl);
        myFirma.map.get('e').addEmployee(Nadine);
        myFirma.map.get('e').addEmployee(Jens);

        System.out.print("The new emplyees are: ");
        System.out.print(Karl + " ");
        System.out.print(Nadine + " ");
        System.out.println(Jens);
        System.out.println(myFirma);

        myFirma.map.remove('e');
        System.out.println(myFirma);

    }

}
