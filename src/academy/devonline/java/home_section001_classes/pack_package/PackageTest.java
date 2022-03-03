package academy.devonline.java.home_section001_classes.pack_package;


//import academy.devonline.java.home_section001_classes.dyna_array.HomeDynaArrayVer2;

import academy.devonline.java.home_section001_classes.dyna_array.HomeDynaArrayVer2;
import academy.devonline.java.home_section001_classes.full_class_dyna_array.DynaArray;
import academy.devonline.java.section001_classes.package1.Class1;

import java.util.Arrays;
import java.util.BitSet;

public class PackageTest {
    public static void main(String[] args) {
        HomeDynaArrayVer2 homeDynaArrayVer2 = new HomeDynaArrayVer2();

        DynaArray dynaArray = new DynaArray();
        System.out.println(dynaArray);

        var class1 = new Class1();
        System.out.println(class1);

        var class11 = new academy.devonline.java.section001_classes.package2.Class1();
        System.out.println(class11);

        Arrays.toString(new int[0]);
        BitSet bitSet;
    }
}
