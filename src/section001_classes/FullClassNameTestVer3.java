package section001_classes;

/**
 * #119
 */

import section001_classes.package2.Class1;
import structures.DynaArray;

public class FullClassNameTestVer3 {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();

        //structures.DynaArray dynaArray2 = new structures.DynaArray();

        Class1 class1 = new Class1();
    }
}
