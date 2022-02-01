package section001_classes;

//104
public class DynaArrayTestVer5 {
    public static void main(String[] args) {
        DynaArrayVer5 dynaArray = new DynaArrayVer5();

        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(4);
        dynaArray.add(5);

        System.out.println(dynaArray.asString());
    }
}
