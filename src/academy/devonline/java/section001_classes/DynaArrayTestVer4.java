package academy.devonline.java.section001_classes;

import java.util.Arrays;
//101
public class DynaArrayTestVer4 {
    public static void main(String[] args) {
        DynaArrayVer4 dynaArray1 = new DynaArrayVer4();
        DynaArrayVer4 dynaArray2 = new DynaArrayVer4();

        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray1.toArray()) + " ");
        System.out.println(dynaArray1.count);

        System.out.print("dynaArray2: ");
        System.out.print(Arrays.toString(dynaArray2.toArray()) + " ");
        System.out.println(dynaArray2.count);

        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);

        System.out.println("------------------------------------");

        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray1.toArray()) + " ");
        System.out.println(dynaArray1.count);

        System.out.print("dynaArray2: ");
        System.out.print(Arrays.toString(dynaArray2.toArray()) + " ");
        System.out.println(dynaArray2.count);
    }
}
