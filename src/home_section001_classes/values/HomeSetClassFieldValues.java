package home_section001_classes.values;


import java.util.Arrays;

/**
 * Присвоить значения явным образом полям класса
 * Вывезти значения полей
 * Удалить решение
 */
public class HomeSetClassFieldValues {
    // объявили ссылки
    int primitive = 5;

    int[] array1 = new int[10];

    String[] array2 = new String[3];

    public static void main(String[] args) {
        HomeSetClassFieldValues hSet = new HomeSetClassFieldValues();
        System.out.println(hSet.primitive);
        System.out.println(Arrays.toString(hSet.array1));
        System.out.println(Arrays.toString(hSet.array2));
    }
}
