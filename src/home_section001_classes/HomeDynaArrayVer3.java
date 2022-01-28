package home_section001_classes;

public class HomeDynaArrayVer3 {
    int[] result = new int[5];

    int count;

    void add(int value) {
        if (count == result.length) {
            int[] newAr = new int[result.length * 2];
            System.arraycopy(result, 0, newAr, 0, result.length);
            result = newAr;
        }
        result[count++] = value;
    }
}
