package home_section001_classes;

import java.util.Arrays;
// Задача 103
public class HomeDynaArrayAsString {
    int[] result = new int[5];

    int count;

    void add(int value) {
        if (count == result.length) {
            int[] newArray = new int[result.length * 2];
            System.arraycopy(result, 0, newArray, 0, result.length);
            result = newArray;
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

    String asString(int[] array) {
        StringBuilder as = new StringBuilder();
        if(array.length == 0) {
            as = new StringBuilder("[" +  "]");
            return as.toString();
        }
        as.append("[");
        for (int i = 0; i < array.length; i++) {
            var j = array[i];
            if(i == array.length - 1) {
                as.append(Integer.toString(j));
            } else {
                as.append(Integer.toString(j)).append(",");
            }
        }
        as.append("]");
        return as.toString();
    }
}
