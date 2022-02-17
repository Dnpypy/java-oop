package home_section001_classes.values;

import section001_classes.DynaArray;

import java.util.Arrays;


/**
 * Вывезти значения по-умолчанию полей переменных класса и локальные переменные метода main
 * Удалить решение
 */
public class HomeClassFieldVsLocalVar {
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
        boolean aBoolean = false;
        byte aByte = 0;
        short aShort = 0;
        int anInt = 0;
        long aLong = 0;
        float aFloat = 0;
        double aDouble = 0;
        char aChar = 0;
        String string = null;
        int[] array = null;
        DynaArray dynaArray = null;

        HomeClassFieldVsLocalVar hf = new HomeClassFieldVsLocalVar();
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

        System.out.println(aBoolean);
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(anInt);
        System.out.println(aLong);
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(aChar);
        System.out.println(string);
        System.out.println(Arrays.toString(array));
        System.out.println(dynaArray);

    }
}