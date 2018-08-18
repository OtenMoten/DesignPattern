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
public class Cuboid extends Body {

    private final double valueA, valueB, valueC;
    private final double myWeight;

    public Cuboid(double myWeight, double... inputValues) {

        this.valueA = inputValues[0];
        this.valueB = inputValues[1];
        this.valueC = inputValues[2];
        this.myWeight = myWeight;

    }

    @Override
    public double getVolume() {
        return this.valueA * this.valueB * this.valueC;
    }

}
