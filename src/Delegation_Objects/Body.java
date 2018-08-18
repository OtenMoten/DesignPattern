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
public abstract class Body {

    protected double weight;

    public abstract double getVolume();

    public double getMass() {
        return this.getVolume() * this.weight;
    }

}
