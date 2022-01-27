package home_section001_classes;

import section001_classes.ClassFieldVsLocalVar;
import section001_classes.DynaArray;


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
        long aLong = 0 ;
        float aFloat = 0;
        double aDouble = 0;
        char aChar = 0;
        String string = null;
        int[] array = null;
        DynaArray dynaArray = null;

        HomeClassFieldVsLocalVar fieldVsLocalVar = new HomeClassFieldVsLocalVar();
        System.out.println(fieldVsLocalVar.aBoolean);
        System.out.println(fieldVsLocalVar.aByte);
        System.out.println(fieldVsLocalVar.aShort);
        System.out.println(fieldVsLocalVar.anInt);
        System.out.println(fieldVsLocalVar.aChar);
        System.out.println(fieldVsLocalVar.string);
        System.out.println(fieldVsLocalVar.array);
        System.out.println(fieldVsLocalVar.dynaArray);

        System.out.println(aBoolean);
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(anInt);
        System.out.println(aLong);
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(aChar);
        System.out.println(string);
        System.out.println(array);
        System.out.println(dynaArray);

    }
}
