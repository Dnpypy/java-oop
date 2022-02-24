package home_section001_classes.methods_dyna_array.dyna_array_clear;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray(0);
        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);

        System.out.println(dynaArray.asString());

        dynaArray.clear();

        System.out.println(dynaArray.asString());
    }
}
