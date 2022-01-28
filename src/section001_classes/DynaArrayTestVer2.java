package section001_classes;

public class DynaArrayTestVer2 {
    public static void main(String[] args) {
        DynaArrayVer3 dynaArray1 = new DynaArrayVer3 ();
        DynaArrayVer3  dynaArray2 = new DynaArrayVer3 ();

        dynaArray1.add(1);
        dynaArray1.add(2);

        dynaArray2.add(34);

        System.out.println(dynaArray1.count);
        System.out.println(dynaArray2.count);
    }
}
