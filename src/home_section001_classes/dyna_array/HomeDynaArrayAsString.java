package home_section001_classes.dyna_array;

import java.util.Arrays;
// Задача 103
// Класс тест HomeDynaArrayAsStringTest
public class HomeDynaArrayAsString {
    int[] result = new int[5];

    int count;

    /**
     * динамически расширяет динамический массив при увеличение элементов
     * @param value число которое записываем в массив
     */
    void add(int value) {
        if(result.length == count) {
            int[] tempAr = new int[result.length * 2];
            System.arraycopy(result, 0, tempAr, 0, result.length);
            result = tempAr;
        }
        result[count++] = value;
    }

    /**
     * Получает копию статического исходного массива основываясь на исходном массиве и на кол-ве элементов которыми он заполнен
     * @return будет возвращать статический массив целого типа в количестве count
     */
    int[] toArray() {
        return Arrays.copyOf(result, count);
    }

    /**
     * @return строковое представления массива [....]
     */
    String asString(){
        StringBuilder sb = new StringBuilder().append("[");
        for (int i = 0; i < count; i++) {
            sb.append(result[i]);
            if(i < count - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
