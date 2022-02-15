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

        HomeClassFieldVsLocalVar hcfv = new HomeClassFieldVsLocalVar();
        System.out.println(hcfv.aBoolean);
        System.out.println(hcfv.aByte);
        System.out.println(hcfv.aShort);
        System.out.println(hcfv.anInt);
        System.out.println(hcfv.aLong);
        System.out.println(hcfv.aFloat);
        System.out.println(hcfv.aDouble);
        System.out.println(hcfv.aChar);
        System.out.println(hcfv.string);
        System.out.println(hcfv.dynaArray);
        System.out.println(Arrays.toString(hcfv.array));

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
