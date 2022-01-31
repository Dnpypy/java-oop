package home_section001_classes;

import java.util.Arrays;

/**
 *  копирования элементов из одного массива в другой.
 */
public class HomeArrayCopy {
    public static void main(String[] args) {

        int[] bbb = {1, 2, 3};
        int[] arr = new int[bbb.length * 2];

        System.arraycopy(bbb,0, arr,0, bbb.length);
        System.out.println(Arrays.toString(arr));
        //Результат должен получится[1, 2, 3, 0, 0, 0]

    }
}
