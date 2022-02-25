package home_section001_classes.methods_dyna_array.dyna_array_contains;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();
        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);

        System.out.println(dynaArray.onString(dynaArray.contains(0)));
        System.out.println(dynaArray.onString(dynaArray.contains(2)));

        System.out.println(dynaArray.onString(dynaArray.contains(100)));
        System.out.println(dynaArray.onString(dynaArray.contains(-3)));

    }


}
