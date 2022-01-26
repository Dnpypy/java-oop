package section001_classes;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, -2, -3, 4, -5};

        DynaArray dynaArray = getPositiveNumbers(array);

        for (int i = 0; i < dynaArray.count; i++) {
            System.out.print(dynaArray.result[i] + " ");
        }

    }

    private static DynaArray getPositiveNumbers(int[] array) {
        int[] newArr = new int[array.length];
        var n1 = 0;
        for (Integer i : array) {
            if(i > 0) {
                newArr[n1] = i;
                n1++;
            }
        }
        DynaArray dynaArray = new DynaArray();
        dynaArray.result = newArr;
        dynaArray.count = n1;
        return dynaArray;
    }
}
