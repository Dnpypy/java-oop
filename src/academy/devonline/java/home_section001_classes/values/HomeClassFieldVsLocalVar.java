package academy.devonline.java.home_section001_classes.values;

import academy.devonline.java.structures.DynaArray;

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
        boolean aBoolean = true;
        byte aByte = 0;
        short aShort = 0;
        int anInt = 0;
        long aLong = 0;
        float aFloat = 0;
        double aDouble = 0.0;
        char aChar = 0;
        String string = null;
        int[] array = null;
        DynaArray dynaArray = null;

        HomeClassFieldVsLocalVar hh = new HomeClassFieldVsLocalVar();
        System.out.println(hh.aBoolean);
        System.out.println(hh.aByte);
        System.out.println(hh.aShort);
        System.out.println(hh.anInt);
        System.out.println(hh.aLong);
        System.out.println(hh.aFloat);
        System.out.println(hh.aDouble);
        System.out.println(hh.aChar);
        System.out.println(hh.string);
        System.out.println(Arrays.toString(hh.array));
        System.out.println(hh.dynaArray);

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
