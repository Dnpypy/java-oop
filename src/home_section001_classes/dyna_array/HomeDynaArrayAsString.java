package home_section001_classes.dyna_array;




import java.util.Arrays;

// Задача 103
// Класс тест HomeDynaArrayAsStringTest
public class HomeDynaArrayAsString {
    private int[] res = new int[5];

    private int count;

    /**
     * динамически расширяет динамический массив при увеличение элементов
     *
     * @param value число которое записываем в массив
     */
    void add(int value) {
        if(res.length == count) {
            int[] tempAr = new int[res.length * 2];
            System.arraycopy(res, 0, tempAr, 0, res.length);
            res = tempAr;
        }
        res[count++] = value;

    }

    /**
     * добавляет все элементы из статического массива
     *
     * @param array статичиского массив
     */
    public void add(int[] array) {
        for (int v : array) {
            add(v);
        }
    }

    /**
     * добавляет все элементы из динамического массива
     *
     * @param dynaArray динамический массив
     */
    public void add(HomeDynaArrayAsString dynaArray) {
        for (int i = 0; i < dynaArray.count; i++) {
            add(dynaArray.res[i]);
        }
    }

    /**
     * Получает копию статического исходного массива основываясь на исходном массиве и на кол-ве элементов которыми он заполнен
     *
     * @return будет возвращать статический массив целого типа в количестве count
     */
    int[] toArray() {
        return Arrays.copyOf(res, count);
    }

    /**
     * @return строковое представления массива [....]
     */
    String asString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            sb.append(res[i]);
            if (i < count - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();

    }
}

