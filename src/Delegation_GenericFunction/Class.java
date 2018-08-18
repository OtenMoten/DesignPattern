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
public class Class {

    public static void main(String[] args) {

        Person myPersonAlpha = new Person("Alfredo", 1996, 2120.0);
        Person myPersonBeta = new Person("Konrad", 1990, 2000.0);

        System.out.println(NotNull.printIgnoreNull("abc", "dfg", null, "xyz"));
        System.out.println(NotNull.printIgnoreNull(null, 123, null));
        System.out.println(NotNull.printIgnoreNull(null, 'm', 345));
        System.out.println(NotNull.printIgnoreNull(myPersonBeta, null, myPersonAlpha, 123));

    }

}
