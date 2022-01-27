package home_section001_classes;

import section001_classes.DynaArray;

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
        HomeClassFieldVsLocalVar fieldVsLocalVar = new HomeClassFieldVsLocalVar();
        System.out.println(fieldVsLocalVar.aBoolean);
        System.out.println(fieldVsLocalVar.aByte);
        System.out.println(fieldVsLocalVar.aShort);
        System.out.println(fieldVsLocalVar.anInt);
        System.out.println(fieldVsLocalVar.aChar);
        System.out.println(fieldVsLocalVar.string);
        System.out.println(fieldVsLocalVar.array);
        System.out.println(fieldVsLocalVar.dynaArray);
    }
}
