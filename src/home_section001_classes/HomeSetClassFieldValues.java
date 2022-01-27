package home_section001_classes;


import java.util.Arrays;

/**
 * Присвоить значения явным образом полям класса
 * Вывезти значения полей
 * Удалить решение
 */
public class HomeSetClassFieldValues {
    int primitive = 54;

    int[] array1 = new int[5];

    String[] array2 = new String[12];

    public static void main(String[] args) {
        HomeSetClassFieldValues fieldVsLocalVar = new HomeSetClassFieldValues();
        System.out.println(fieldVsLocalVar.primitive);
        System.out.println(Arrays.toString(fieldVsLocalVar.array1));
        System.out.println(Arrays.toString(fieldVsLocalVar.array2));
    }
}
