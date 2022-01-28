package home_section001_classes;


import java.util.Arrays;

/**
 * Присвоить значения явным образом полям класса
 * Вывезти значения полей
 * Удалить решение
 */
public class HomeSetClassFieldValues {
    int primitive = 78;

    int[] array1 = {1, 2, 3};

    String[] array2 = {"!2", "233", "444"};

    public static void main(String[] args) {
        HomeSetClassFieldValues set = new HomeSetClassFieldValues();
        System.out.println(set.primitive);
        System.out.println(Arrays.toString(set.array1));
        System.out.println(Arrays.toString(set.array2));
    }
}