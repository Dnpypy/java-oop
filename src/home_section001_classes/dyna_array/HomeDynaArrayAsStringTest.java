package home_section001_classes.dyna_array;


// Задача 103
public class HomeDynaArrayAsStringTest {
    public static void main(String[] args) {
        HomeDynaArrayAsString dynaArray = new HomeDynaArrayAsString();
        //добавление с целым аргументов
        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(4);
        dynaArray.add(5);

        //статический массив
        dynaArray.add(new int[]{2, 5});

        //из друго дин массива dynaArray2
        HomeDynaArrayAsString dynaArray2 = new HomeDynaArrayAsString();
        dynaArray2.add(new int[]{-6, -7, -8});
        dynaArray.add(dynaArray2);

        //dynaArray.count = 20;

        System.out.println(dynaArray.asString());
    }
}
