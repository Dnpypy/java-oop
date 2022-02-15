package section001_classes;

import java.util.Arrays;
//101
public class DynaArrayVer4 {
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


}
