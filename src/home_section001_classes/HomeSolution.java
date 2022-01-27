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

        HomeMinusArray minusArray = getNegativeNumbers(array);

        for (int i = 0; i < minusArray.num; i++) {
            System.out.print(minusArray.array[i] + " ");
        }
    }

    private static HomeMinusArray getNegativeNumbers(int[] array) {
        int[] tempArray = new int[array.length];
        var tempCount = 0;
        for (Integer g : array) {
            if(g < 0) {
                tempArray[tempCount] = g;
                tempCount++;
            }
        }
        HomeMinusArray minus = new HomeMinusArray();
        minus.array = tempArray;
        minus.num = tempCount;
        return minus;
    }


}
