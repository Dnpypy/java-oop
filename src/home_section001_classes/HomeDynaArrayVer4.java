package home_section001_classes;

import java.util.Arrays;

public class HomeDynaArrayVer4 {
    int[] dyna = new int[6];

    int num;

    void add(int value) {
        if(dyna.length == num) {
            int[] tempAr = new int[dyna.length * 2];
            System.arraycopy(dyna, 0, tempAr, 0, dyna.length);
            dyna = tempAr;
        }
        dyna[num++] = value;
    }

    int[] toArray() {
        return Arrays.copyOf(dyna, num);
    }
}
