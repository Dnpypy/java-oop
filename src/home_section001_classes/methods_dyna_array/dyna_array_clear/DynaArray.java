package home_section001_classes.methods_dyna_array.dyna_array_clear;

import java.util.Arrays;

/**
 * Практика: Метод DynaArray.clear (151)
 * Необходимо реализовать метод clear, который очищает созданный динамический массив.
 *
 * После вызова данного метода массив должен быть пустым.
 *
 *
 *
 * Например, следующий код
 *
 * class DynaArrayTest {
 *     public static void main(String[] args) {
 *         DynaArray dynaArray = new DynaArray();
 *         dynaArray.add(0);
 *         dynaArray.add(1);
 *         dynaArray.add(2);
 *         dynaArray.add(3);
 *
 *         System.out.println(dynaArray.asString());
 *
 *         dynaArray.clear();
 *
 *         System.out.println(dynaArray.asString());
 *     }
 * }
 * должен выдавать результат:
 *
 * [0, 1, 2, 3]
 * []
 */
public class DynaArray {
    /**
     * поля
     */
    private int[] result;

    private int count;


    /**
     * геттер
     *
     * @return массив
     */
    public int[] getResult() {
        return result;
    }

    /**
     * геттер
     *
     * @return значение
     */
    public int getCount() {
        return count;
    }

    /**
     * конструкторы
     */
    public DynaArray() {
        this(5);
    }

    public DynaArray(int size) {
        result = new int[size];
    }

    /**
     * добавляет все элементы из статического массива
     *
     * @param array статичиского массив
     */
    public void add(int[] array) {
        // add(с 0 индекса, заканчивая ..length)
        add(array, array.length);
    }

    /**
     * добавляет все элементы из динамического массива
     *
     * @param dynaArray динамический массив
     */
    public void add(home_section001_classes.full_class_dyna_array.DynaArray dynaArray) { // второй объект DynaArrayAdd, первый объект сам класс
        // дин массив класс DynaArrayAdd
        //первый аргумент статич массив dynaArray.result
        //второй аргумент кол-во элементов в этом массиве dynaArray.count
        add(dynaArray.getResult(), dynaArray.getCount());
    }

    /**
     * private потомучто метод add будет использоваьтся в данном классе только
     *
     * @param array  принмает массив
     * @param length (длина массива) сколько кол-во элементов этого массива нужно скопировать начиная с 0 индекса
     */
    private void add(int[] array, int length) {
        //result.length - count <--- это сколько свободных ячеек в статич массиве result
        // если не моещается то расширяем
        if (result.length - count < length) {
            grow(count + length);
        }
        //из array в result
        //обновление длины массива
        System.arraycopy(array, 0, result, count, length);
        count += length; //обновление длины массива
    }

    /**
     * @param value целое число
     */
    public void add(int value) {
        if (count == result.length) {
            grow(result.length == 0 ? 5 : result.length * 2);
        }
        result[count++] = value;
    }

    /**
     * приватная функция grow, которая увеличивает наш массив
     *
     * @param length длина значение
     */
    private void grow(int length) {
        int[] newArray = new int[length];
        System.arraycopy(result, 0, newArray, 0, result.length);
        result = newArray;
    }

    /**
     * Получает копию статического исходного массива основываясь на исходном массиве и на кол-ве элементов которыми он заполнен
     *
     * @return будет возвращать статический массив целого типа в количестве count
     */
    public int[] toArray() {
        return Arrays.copyOf(result, count);
    }

    /**
     * @return строковое представления массива [....]
     */
    public String asString() {
        final StringBuilder stringBuilder = new StringBuilder().append('[');
        for (int i = 0; i < count; i++) {
            stringBuilder.append(result[i]);
            if (i < count - 1) {
                stringBuilder.append(',').append(' ');
            }
        }
        return stringBuilder.append(']').toString();
    }

    /**
     * Обнуление перем count результат []
     */
    public void clear() {
        count = 0;
    }
}
