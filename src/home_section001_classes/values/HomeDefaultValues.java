package home_section001_classes.values;

import section001_classes.DynaArray;

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
        HomeDefaultValues hf = new HomeDefaultValues();
        System.out.println(hf.aBoolean);
        System.out.println(hf.aByte);
        System.out.println(hf.aShort);
        System.out.println(hf.anInt);
        System.out.println(hf.aLong);
        System.out.println(hf.aFloat);
        System.out.println(hf.aDouble);
        System.out.println(hf.aChar);
        System.out.println(hf.string);
        System.out.println(Arrays.toString(hf.array));
        System.out.println(hf.dynaArray);
    }
}