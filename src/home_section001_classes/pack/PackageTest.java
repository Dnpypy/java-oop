package home_section001_classes.pack;


import home_section001_classes.dyna_array.HomeDynaArrayVer4;
import structures.DynaArray;
import section001_classes.package1.Class1;

import java.util.Arrays;
import java.util.BitSet;

public class PackageTest {
    public static void main(String[] args) {
        HomeDynaArrayVer4 hd = new HomeDynaArrayVer4();
        System.out.println(hd);

        DynaArray da = new DynaArray();
        System.out.println(da);

        Class1 cls1 = new Class1();
        System.out.println(cls1);

        section001_classes.package2.Class1 cls2 = new section001_classes.package2.Class1();
        System.out.println(cls2);

        //Example ex = new Example(); пакет по умолчанию src

        //посл задание
        Arrays.toString(new int[0]);
        BitSet bitSet;


    }
}
