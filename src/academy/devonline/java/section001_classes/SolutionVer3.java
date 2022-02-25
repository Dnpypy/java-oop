package academy.devonline.java.section001_classes;

public class SolutionVer3 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5, 8, 9, 5, 6, 34};

        DynaArrayVer3 result = getPositiveNumbers(array);

        for (int i = 0; i < result.count; i++) {
            System.out.print(result.result[i] + " ");
        }
        System.out.println();
    }

    private static DynaArrayVer3 getPositiveNumbers(int[] array) {
        DynaArrayVer3 dynaArray = new DynaArrayVer3();
        for (int value : array) {
            if (value > 0) {
                //DynaArrayVer3.add(dynaArray, value);
                dynaArray.add(value);
            }
        }
        return dynaArray;
    }
}
