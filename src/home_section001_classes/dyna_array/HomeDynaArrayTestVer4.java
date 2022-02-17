package home_section001_classes.dyna_array;


import java.util.Arrays;

public class HomeDynaArrayTestVer4 {
    public static void main(String[] args) {
        HomeDynaArrayVer4 dynaArraytest1 = new HomeDynaArrayVer4();
        System.out.print("dynaArray1: ");
        System.out.println(Arrays.toString(dynaArraytest1.toArray()));
        System.out.println(dynaArraytest1.getNum());

        HomeDynaArrayVer4 dynaArraytest2 = new HomeDynaArrayVer4();
        dynaArraytest2.add(1);
        dynaArraytest2.add(1);
        dynaArraytest2.add(1);
        dynaArraytest2.add(1);
        dynaArraytest2.add(1);
        System.out.print("dynaArray2: ");
        System.out.println(Arrays.toString(dynaArraytest2.toArray()));
        System.out.println(dynaArraytest2.getNum());

    }
}
