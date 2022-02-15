package home_section001_classes.dyna_array;


/**
 * Все классы в этом задании создаются в пакете dyna_array
 * Создать класс HomeDynaArrayVer3 там создать пустой массив int[] размерностью 5 и объявить int переменную
 * В классе HomeDynaArrayVer3 написать метод add, которая динамически расширяет наш динамический массив при увеличение элементов
 * Создать класс HomeDynaArrayTest в нем создать объект dynaArray класса HomeDynaArrayVer3
 * В этот объект dynaArray добавить с помощью метода add добавить любое число
 * Если поля в другом классе, а класс в другом пакете, просто так переменные-поля класса работать не будут(возможно public поможет)
 */
public class HomeSolutionVer3 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5, 8, 9, 5, 6, 34};

        HomeDynaArrayVer3 result = getPositiveNumbers(array);

        for (int i = 0; i < result.count; i++) {
            System.out.print(result.result[i] + " ");
        }
        System.out.println();
    }

    private static HomeDynaArrayVer3 getPositiveNumbers(int[] array) {
        HomeDynaArrayVer3 dynaArray = new HomeDynaArrayVer3();
        for (int value : array) {
            if (value > 0) {
                //DynaArrayVer3.add(dynaArray, value);
                dynaArray.add(value);
            }
        }
        return dynaArray;
    }
}
