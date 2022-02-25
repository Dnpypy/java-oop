package academy.devonline.java.home_section001_classes.methods_dyna_array.DynaArrayAdd;


/**
 * #133
 * Практика: Оптимизация методов DynaArray.add
 * Необходимо оптимизировать код методов: add(int[] array) и add(DynaArray dynaArray).
 * И
 * Создать метод private void add(int[] array, int length) {
 *
 * Суть оптимизации в следующем: Если будет вызван один из данных методов
 * и передан статический или динамический массив, состоящий например из 75 элементов,
 * то в процессе добавления операция расширения массива с копированием (т.е. операция grow)
 * будет выполнена четыре раза вместо одного:.
 */

import java.util.Arrays;

public class DynaArrayAdd {
    public int[] result = new int[5];

    public int count;


    /**
     * добавляет все элементы из статичиского массива
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
    public void add(DynaArrayAdd dynaArray) { // второй объект DynaArrayAdd, первый объект сам класс
            // дин массив класс DynaArrayAdd
        //первый аргумент статич массив dynaArray.result
        //второй аргумент кол-во элементов в этом массиве dynaArray.count
        add(dynaArray.result, dynaArray.count);
    }

    /**
     *  private потомучто метод add будет использоваьтся в данном классе только
     * @param array принмает массив
     * @param length (длина массива) сколько кол-во элементов этого массива нужно скопировать начиная с 0 индекса
     */
    private void add(int[] array, int length){
        //result.length - count <--- это сколько свободных ячеек в статич массиве result
        // если не моещается то расширяем
            if (result.length - count < length) {
                int[] newArray = new int[count + length];
                System.arraycopy(result, 0, newArray, 0, result.length);
                result = newArray;
            }
        //из array в result
        //обновление длины массива
            System.arraycopy(array, 0, result, count, length);//из array в result
            count += length; //обновление длины массива
    }

    /**
     * @param value целое число
     */
    public void add(int value) {
        if (count == result.length) {
            int[] newArray = new int[result.length * 2];
            System.arraycopy(result, 0, newArray, 0, result.length);
            result = newArray;
        }
        result[count++] = value;
    }

    public int[] toArray() {
        return Arrays.copyOf(result, count);
    }

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
}
