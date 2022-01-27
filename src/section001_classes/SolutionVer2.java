package section001_classes;

public class SolutionVer2 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5, 4 , 3, 2, 2, 2};

        DynaArrayVer2 result = getPositiveNumbers(array);

        for (int i = 0; i < result.count; i++) {
            System.out.print(result.result[i] + " ");
        }
        System.out.println();
    }

    private static DynaArrayVer2 getPositiveNumbers(int[] array) {
        DynaArrayVer2 dynaArray = new DynaArrayVer2();
        for (int value : array) {
            if (value > 0) {
                add(dynaArray, value);
            }
        }
        return dynaArray;
    }

    private static void add(DynaArrayVer2 dynaArray, int value) {
        if (dynaArray.count == dynaArray.result.length) {
            int[] newArray = new int[dynaArray.result.length * 2];
            System.arraycopy(dynaArray.result, 0, newArray, 0, dynaArray.result.length);
            dynaArray.result = newArray;
        }
        dynaArray.result[dynaArray.count++] = value;
    }
}
