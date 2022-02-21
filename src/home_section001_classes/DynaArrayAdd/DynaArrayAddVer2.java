package home_section001_classes.DynaArrayAdd;

import java.util.Arrays;

/**
 * #136
 * Практика: Удаление дублирующего кода в методах
 *  private void add(int[] array, int length) {
 *  public void add(int value)
 * private void grow(){ Создание приватной функции, которая увеличивает наш массив
 *
 *
*/
public class DynaArrayAddVer2 {

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
         *
         * @param array статичиского массив
         */
        public void add(int[] array) {
            add(array, array.length); // add(с 0 индекса, заканчивая ..length)
        }

        /**
         * добавляет все элементы из динамического массива
         *
         * @param dynaArray динамический массив
         */
        public void add(DynaArrayAddVer2 dynaArray) {
            add(dynaArray.result, dynaArray.count);
        }

        /**
         *  private потомучто метод add будет использоваьтся в данном классе только
         * @param array принмает массив
         * @param length (длина массива) сколько кол-во элементов этого массива нужно скопировать начиная с 0 индекса
         */
        private void add(int[] array, int length) {
            if (result.length - count < length) {
                grow(count + length);
            }
            System.arraycopy(array, 0, result, count, length);
            count += length;
        }

        /**
         * @param value целое число
         */
        public void add(int value) {
            if (count == result.length) {
                grow(result.length * 2);
            }
            result[count++] = value;
        }

        /**
         * приватная функция, которая прнимает длину массива и увеличивает наш массив
         * @param newLength длину массива
         */
        private void grow(int newLength) {
            int[] newArray = new int[newLength];
            System.arraycopy(result, 0, newArray, 0, result.length);
            result = newArray;
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
