package home_section001_classes.dyna_array;

import java.util.Arrays;

public class HomeDynaArrayVer4 {
    private int[] arr = new int[5];

    private int num;

    int getNum() {
       return num;
    }

    void add(int value) {
        if (arr.length == num) {
            int[] tempArr = new int[arr.length * 2];
            System.arraycopy(arr, 0, tempArr, 0, arr.length);
            arr = tempArr;
        }
        arr[num++] = value;
    }

    int[] toArray() {
        return Arrays.copyOf(arr, num);
    }


}
