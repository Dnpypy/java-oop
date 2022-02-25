package academy.devonline.java.home_section001_classes.values;

import academy.devonline.java.structures.DynaArray;

import java.util.Arrays;

/**
 * boolean aBoolean = false;
 * byte aByte = 0;
 * short aShort = 0;
 * int anInt = 0;
 * long aLong = 0;
 * float aFloat = 0.0;
 * double aDouble = 0.0;
 * char aChar = 0;
 * String string = null;
 * int[] array = null;
 * DynaArray dynaArray = null;
 */

/**
 * Вывезти значения по-умолчанию полей переменных класса
 * Удалить решение
 */
public class HomeDefaultValues {
    boolean aBoolean;
    byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    char aChar;
    String string;
    int[] array;
    DynaArray dynaArray;

    public static void main(String[] args) {
        //вывезти значения по умолчанию полей класса DefaultValues
        HomeDefaultValues hm = new HomeDefaultValues();
        System.out.println(hm.aBoolean);
        System.out.println(hm.aByte);
        System.out.println(hm.aShort);
        System.out.println(hm.anInt);
        System.out.println(hm.aLong);
        System.out.println(hm.aFloat);
        System.out.println(hm.aDouble);
        System.out.println(hm.aChar);
        System.out.println(hm.string);
        System.out.println(Arrays.toString(hm.array));
        System.out.println(hm.dynaArray);
    }
}
