package academy.devonline.java.home_section001_classes.methods_dyna_array.dyna_array_remove;


import java.util.Arrays;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();
          dynaArray.add(0);
        System.out.println(dynaArray.getCount());
        System.out.println(Arrays.toString(dynaArray.getResult()));
          dynaArray.add(1);
        System.out.println(dynaArray.getCount());
        System.out.println(Arrays.toString(dynaArray.getResult()));
          dynaArray.add(2);
          //dynaArray.add(3);

          System.out.println(dynaArray.asString());

          dynaArray.remove(5);
          // [0, 1, 2, 3]
          System.out.println(dynaArray.asString());

          dynaArray.remove(0);
          // [1, 2, 3]
          System.out.println(dynaArray.asString());

          dynaArray.remove(2);
          // [1, 3]
          System.out.println(dynaArray.asString());

        dynaArray.remove(1);
        // [3]
        System.out.println(dynaArray.asString());
        System.out.println(dynaArray.getCount());
        System.out.println(Arrays.toString(dynaArray.getResult()));
    }

}
