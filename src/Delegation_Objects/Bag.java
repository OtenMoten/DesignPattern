/**
 * In this package you will learn how to deal with delegation.
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_Objects;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.ArrayList;

public class Bag extends ArrayList<Body> {

    private static final long serialVersionUID = 1L;

    public double calcSumVolume() {

        double myResult = 0;

        for (Body myBody : this) {
            myResult += myBody.getVolume();
        }
        return myResult;

    }

    public double calcSumWeight() {

        double myResult = 0;

        for (Body myBody : this) {
            myResult += myBody.getMass();
        }
        return myResult;

    }

    public void toConsole() {

        this.forEach((myElement) -> {
            System.out.println(
                    myElement.getClass().getSimpleName()
                    + " Volume is "
                    + myElement.getVolume()
                    + " Weight is "
                    + myElement.getMass());
        });

    }

}
