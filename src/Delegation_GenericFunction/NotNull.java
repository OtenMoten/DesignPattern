/**
 * In this package you will learn how to deal with delegation.
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_GenericFunction;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class NotNull {

    public static <ClassType> ClassType printIgnoreNull(ClassType... inputObjects) {

        String myOutput = "";

        for (ClassType inputObject : inputObjects) {
            if (inputObject != null) {
                myOutput += String.valueOf(inputObject.toString()) + " ";
            }
        }

        return (ClassType) myOutput;

    }

}
