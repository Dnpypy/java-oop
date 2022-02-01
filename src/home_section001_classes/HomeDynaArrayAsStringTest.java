package home_section001_classes;

import section001_classes.DynaArray;
// Задача 103
public class HomeDynaArrayAsStringTest {
    public static void main(String[] args) {
        HomeDynaArrayAsString dynaAr1 = new HomeDynaArrayAsString();
        System.out.print("dynaArray1: ");
        System.out.println(dynaAr1.asString());
        System.out.println(dynaAr1.count);

        HomeDynaArrayAsString dynaAr2 = new HomeDynaArrayAsString();
        System.out.println(dynaAr2.asString());
        dynaAr2.add(5);
        dynaAr2.add(5);
        dynaAr2.add(5);
        dynaAr2.add(5);
        dynaAr2.add(5);
        dynaAr2.add(5);
        System.out.print("dynaArray2: ");
        System.out.println(dynaAr2.asString());
        System.out.println(dynaAr2.count);

        HomeDynaArrayAsString dynaAr3 = new HomeDynaArrayAsString();
        System.out.println(dynaAr3.asString());
        dynaAr3.add(0);
        dynaAr3.add(1);
        dynaAr3.add(2);
        dynaAr3.add(3);
        dynaAr3.add(4);
        dynaAr3.add(5);
        System.out.print("dynaArray3: ");
        System.out.println(dynaAr3.asString());
        System.out.println(dynaAr3.count);


    }
}
