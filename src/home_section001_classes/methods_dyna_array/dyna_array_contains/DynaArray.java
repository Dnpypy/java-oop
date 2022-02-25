package home_section001_classes.methods_dyna_array.dyna_array_contains;

import java.util.Arrays;

/**
 * 157
 * Практика: Метод DynaArray.contains
 * Необходимо реализовать метод boolean contains(int value), который возвращает true,
 * если элемент присутствует в динамическом массиве, иначе - false!
 * <p>
 * Например, следующий код:
 * <p>
 * class DynaArrayTest {
 * public static void main(String[] args) {
 * DynaArray dynaArray = new DynaArray();
 * dynaArray.add(0);
 * dynaArray.add(1);
 * dynaArray.add(2);
 * dynaArray.add(3);
 * <p>
 * System.out.println(dynaArray.contains(0));
 * System.out.println(dynaArray.contains(2));
 * <p>
 * System.out.println(dynaArray.contains(100));
 * System.out.println(dynaArray.contains(-3));
 * }
 * }
 * должен выдавать результат:
 * <p>
 * true     - 0 - присутствует!
 * true     - 2 - присутствует!
 * false    - 1000 - отсутствует!
 * false    - -3 - отсутствует
 */
public class DynaArray {
    /**
     * поля
     */
    private int[] result;
    private int resultNum;
    private int count;

    /**
     * геттер
     *
     * @return целое число
     */
    public int getResultNum() {
        return resultNum;
    }

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
    public void add(DynaArray dynaArray) { // второй объект DynaArrayAdd, первый объект сам класс
        // дин массив класс DynaArrayAdd
        //первый аргумент статич массив dynaArray.result
        //второй аргумент кол-во элементов в этом массиве dynaArray.count
        add(dynaArray.result, dynaArray.count);
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
     * Обнуление перем count
     */
    public void clear() {
        count = 0;
    }

    /**
     * Если элемент был удален, то метод возвращает true, иначе - false!
     *
     * @param value целое число которое ищем
     * @return true или false
     */

    public boolean remove(int value) {
        // если элемент присутствует то переменная индекс будет хранить индекс элемента от 0 до значения count
        //если элемент отсутствует от индекс будет равен -1
        var index = indexOf(value);
        if (index != -1) {
            removeByIndex(index);
            return true;
        } else {
            return false;
        }
    }

    /**
     * method remove -
     * | - removeByIndex
     * При удалении посл элемента ничего делать не нужно,
     * но при удалении первого элемента, нужно все элементы сдвинуть на 1 индекс влево
     * Проверка как раз определяет нужно ли делать сдвигание или не нужно(Операция сдвига)
     *
     * @param index принимает индекс элемента
     */
    // [0,1,2,3,4]  Пример index = 0
    private void removeByIndex(int index) {
        // 0 < 5 - 1
        if (index < count - 1) {
//            for (int i = index; i < count - 1; i++) {
//                result[i] = result[i + 1];
//            }
            // (0,1,2,3,4) , 0 + 1 позиция начала нового массива, (1,2,3,4) массив-назначения, 0 начальным положением целевого массива,
            //это количество элементов, которые будут скопированы 5 - 1 - 0 = 4
            System.arraycopy(result, index + 1, result, index, count - 1 - index);
        }
        count--; // с 5 до 4
    }

    /**
     * method remove -
     * | - method indexOf
     * метод приватный для внутренного использования, реализация обычный линейный поиск
     *
     * @param value целое число
     *              return индекс элемента или -1
     */
    private int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (result[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @return размер массива целое число
     */
    public int size() {
        return count;
    }

    /**
     * который возвращает true,
     * если элемент присутствует в динамическом массиве, иначе - false!
     * resultNum приватное поле! в которое передается элемент который ищем
     *
     * @param value элемент
     * @return true of false
     */
    public boolean contains(int value) {
        var bool = false;
        for (int i = 0; i < count; i++) {
            if (result[i] == value) {
                bool = true;
            }
        }
        resultNum = value;
        return bool;
    }

    /**
     * @param bool принимает булево значение
     * @return строковое представление строки
     */
    public String onString(boolean bool) {
        final StringBuilder stringBuilder = new StringBuilder();
        if (bool) {
            stringBuilder.append("true  - ").append(getResultNum()).append(" -  присутствует");
        } else {
            stringBuilder.append("false  - ").append(getResultNum()).append(" -  отсутствует");
        }
        return stringBuilder.append('!').toString();
    }
}
