package academy.devonline.java.section001_classes;

import java.util.Arrays;

public class DynaArrayTestVer3 {
    public static void main(String[] args) {
        DynaArrayVer3 dynaArray1 = new DynaArrayVer3();
        DynaArrayVer3 dynaArray2 = new DynaArrayVer3();

        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray1.result) + " ");
        System.out.println(dynaArray1.count);

        System.out.print("dynaArray2: ");
        System.out.print(Arrays.toString(dynaArray2.result) + " ");
        System.out.println(dynaArray2.count);

        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);

        System.out.println("------------------------------------");

        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray1.result) + " ");
        System.out.println(dynaArray1.count);

        System.out.print("dynaArray2: ");
        System.out.print(Arrays.toString(dynaArray2.result) + " ");
        System.out.println(dynaArray2.count);
    }
}
