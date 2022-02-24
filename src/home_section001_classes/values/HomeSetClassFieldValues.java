package home_section001_classes.values;


import java.util.Arrays;

/**
 * Присвоить значения явным образом полям класса
 * Вывезти значения полей
 * Удалить решение
 */
public class HomeSetClassFieldValues {
    // объявили ссылки
    int primitive = 100;

    int[] array = new int[12];

    String[] array2 = new String[100];

    public static void main(String[] args) {
        HomeSetClassFieldValues hset = new HomeSetClassFieldValues();
        System.out.println(hset.primitive);
        System.out.println(Arrays.toString(hset.array));
        System.out.println(Arrays.toString(hset.array2));
    }
}
