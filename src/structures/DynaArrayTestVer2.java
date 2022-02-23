package structures;

import java.util.Arrays;

public class DynaArrayTestVer2 {
    public static void main(String[] args) {
        DynaArrayVer2 dynaArray = new DynaArrayVer2(0);

        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(4);

        int[] array = dynaArray.toArray();

        System.out.println(Arrays.toString(array));
        System.out.println(dynaArray.asString());

        array[0] = -1;

        System.out.println(Arrays.toString(array));
        System.out.println(dynaArray.asString());

        int[] arra = new int[0];
        System.out.println(Arrays.toString(arra));
    }
}
