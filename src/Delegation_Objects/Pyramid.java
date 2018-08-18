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
public class Pyramid extends Body {

    private final double valueA;
    private final double valueH;

    public Pyramid(double weight, double newValueA, double newValueH) {
        this.valueA = newValueA;
        this.valueH = newValueH;
        super.weight = weight;
    }

    @Override
    public double getVolume() {
        return (this.valueA * this.valueA * this.valueH) / 3;
    }
}
