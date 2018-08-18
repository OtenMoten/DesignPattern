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

public class BodyManagement {

    private final ArrayList<Body> myBag = new ArrayList<>();

    public void addBody(Body newBody) {
        this.myBag.add(newBody);
    }

    public double getSumaryVolume() {

        double myResult = 0;

        for (Body myBody : this.myBag) {
            myResult += myBody.getVolume();
        }

        return myResult;

    }

    public double getSumaryWeight() {

        double myResult = 0;

        for (Body myBody : myBag) {
            myResult += myBody.getMass();
        }

        return myResult;

    }

    public ArrayList<Body> getSack() {
        return myBag;
    }

    public void toConsole() {

        for (Body k : myBag) {
            System.out.println(
                    k.getClass().getSimpleName()
                    + " Volume is "
                    + k.getVolume()
                    + "  Weight is "
                    + k.getMass());
        }

    }

}
