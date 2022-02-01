package home_section001_classes;

import section001_classes.DynaArray;
// Задача 103
public class HomeDynaArrayAsStringTest {
    public static void main(String[] args) {
        HomeDynaArrayAsString dynaAr1 = new HomeDynaArrayAsString();
        System.out.print("dynaArray1: ");
        System.out.print(dynaAr1.asString(dynaAr1.toArray()) + " ");
        System.out.println(dynaAr1.count);

        HomeDynaArrayAsString dynaAr2 = new HomeDynaArrayAsString();
        System.out.println(dynaAr2.asString(dynaAr2.toArray()) + " ");
        dynaAr2.add(5);
        dynaAr2.add(5);
        dynaAr2.add(5);
        dynaAr2.add(5);
        dynaAr2.add(5);
        dynaAr2.add(5);
        System.out.print("dynaArray2: ");
        System.out.println(dynaAr2.asString(dynaAr2.toArray()) + " ");
        System.out.println(dynaAr2.count);
    }
}
