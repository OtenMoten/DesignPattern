package Delegation_GenericFunction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
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
