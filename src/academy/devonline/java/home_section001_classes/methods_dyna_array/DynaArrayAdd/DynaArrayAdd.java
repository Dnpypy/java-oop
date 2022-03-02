package academy.devonline.java.home_section001_classes.methods_dyna_array.DynaArrayAdd;


/**
 * #133
 * Практика: Оптимизация методов DynaArray.add
 * Необходимо оптимизировать код методов: add(int[] array) и add(DynaArray dynaArray).
 * И
 * * Создать два перегруженных метода add
 *  * с параметрами стат массива int[] array и динам массива MethodOverloading dynaArray
 *  * В первом случае длина стат массива length
 *  * Во втором случает у объекта MethodOverloading длина массива выступает не length, а поле count
 *  И
 * Создать метод private void add(int[] array, int length) {
 * В перегруженных методах будет участвовать внутри приватный метод add(int[] array, int length)
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
     * добавляет все элементы из статического массива
     *
     * @param array статического массив
     */
    public void add(int[] array) {
         // add(с 0 индекса, заканчивая ..length)
        //...
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
       //..
    }

    /**
     *  private потомучто метод add будет использоваьтся в данном классе только
     * @param array принмает массив
     * @param length (длина массива) сколько кол-во элементов этого массива нужно скопировать начиная с 0 индекса
     */
    private void add(int[] array, int length){
        //result.length - count <--- это сколько свободных ячеек в статич массиве result
        // если не помещается то расширяем
       //....

        //...//из array в result
       //....; //обновление длины массива
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
