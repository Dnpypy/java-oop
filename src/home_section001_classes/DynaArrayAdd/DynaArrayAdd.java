package home_section001_classes.DynaArrayAdd;




import java.util.Arrays;

public class DynaArrayAdd {
    public int[] result = new int[5];

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /**
     * добавляет все элементы из статичиского массива
     * @param array статичиского массив
     */
    public void add(int[] array) {
        for (int value : array) {
            add(value); // тут вызывается метод add целое число из этого же класса
        }
    }

    /**
     * добавляет все элементы из динамического массива
     * @param dynaArray динамический массив
     */
    public void add(DynaArrayAdd dynaArray) { // второй объект DynaArrayAdd, первый объект сам класс
        for (int i = 0; i < dynaArray.count; i++) {
            add(dynaArray.result[i]);
        }
    }

    /**
     *
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
