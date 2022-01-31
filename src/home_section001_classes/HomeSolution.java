package home_section001_classes;


/**
 * Создать класс HomeMinusArray в этом же пакете home_section001_classes, в нем объявить один int[] массив и одну переменную int
 * Создать в классе HomeSolution объект класса HomeMinusArray и этому объекту присвоить ссылку на метод getNegativeNumbers(array);
 * Создать метод getNegativeNumbers(array) в котором необходимо найти все числа меньше нуля и возвращает переменную типа HomeMinusArray(дин массив)
 * Удалить решение
 */
public class HomeSolution {
    public static void main(String[] args) {
        int[] array = {1, -2, -3, 4, -5};

        HomeMinusArray hma = getNegativeNumbers(array);

        for (int i = 0; i < hma.count; i++) {
            System.out.print(hma.result[i] + " ");
        }
    }

    private static HomeMinusArray getNegativeNumbers(int[] array) {
        int[] tempArr = new int[array.length];
        var count = 0;
        for (int j : array) {
            if (j < 0) {
                tempArr[count] = j;
                count++;
            }
        }
        HomeMinusArray temp = new HomeMinusArray();
        temp.result = tempArr;
        temp.count = count;
        return temp;
    }

}
