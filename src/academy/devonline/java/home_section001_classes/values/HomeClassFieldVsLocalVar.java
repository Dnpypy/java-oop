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
        int aInt = 0;
        long aLong = 0;
        float aFloat = 0;
        double aDouble = 0;
        char aChar = 0;
        String string = null;
        int[] array = null;
        DynaArray dynaArray = null;

        System.out.println(aBoolean);
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(aInt);
        System.out.println(aLong);
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(aChar);
        System.out.println(string);
        System.out.println(array);
        System.out.println(dynaArray);

        HomeClassFieldVsLocalVar hmf = new HomeClassFieldVsLocalVar();
        System.out.println(hmf.aBoolean);
        System.out.println(hmf.aByte);
        System.out.println(hmf.aShort);
        System.out.println(hmf.anInt);
        System.out.println(hmf.aLong);
        System.out.println(hmf.aFloat);
        System.out.println(hmf.aDouble);
        System.out.println(hmf.aChar);
        System.out.println(hmf.string);
        System.out.println(Arrays.toString(hmf.array));
        System.out.println(hmf.dynaArray);
    }
}
