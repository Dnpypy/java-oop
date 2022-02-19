package section001_classes;

import structures.DynaArray;

import java.util.Arrays;

public class WhatIsNullPointerException {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();
        dynaArray.result = new int[5];
        dynaArray.setCount(5);

        System.out.println(Arrays.toString(dynaArray.result));
        System.out.println(dynaArray.getCount());

        dynaArray = new DynaArray();
        System.out.println(dynaArray.getCount());
    }
}
