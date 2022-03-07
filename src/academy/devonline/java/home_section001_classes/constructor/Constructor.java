package academy.devonline.java.home_section001_classes.constructor;

import java.util.Arrays;

/**
 * 137-144
 * ~~~~(IDEA)Генерация конструктора alt+insert, далее выбираю с параметром или без него(Select none)~~~
 *
 * 1.Создать конструктор класса
 * Создать точку входа
 * Прописать приватное поле value любого типа
 * В конструктор инициализировать поле любым значением
 * Создать объект и вывести значения поля value
 *
 * 2.Создать приватное поле с статич массивом(String[])
 * Инициализировать его размер по умолчанию в конструторе
 * Создать конструктор с параметром размера статич массива
 * Инициализировать его, и вывезти содержимое
 *
 * 3.Создать геттеры и сеттеры к полям
 * Поменять значение полей через сеттеры и передать параметр массива из первого объекта
 * Создать еще один объект и вывести значение полей через геттеры,
 * массив по умолчанию и с передачей фактических параметров
 *
 * 4.Еще вариант: полям присвоить значения и размеры в свойствах, не в конструкторе
 * Оставить один конструктор с параметром size, создать объект, попробовать передать аргумент размер массива
 * Если не понятно тут(№142 урок)
 *
 * 5. Прописать в конструкторе по умолчанию вызов конструктора из конструктора
 *   с помощью ключевого слова this и передать туда размер массива(№144 урок)
 *   this(..) должен идти первым
 */

public class Constructor {

    private double value;
    private String[] array;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public Constructor() {
        this(4); //5
        value = 15;
    }

    public Constructor(int size) {
        this.array = new String[size];
    }

    public static void main(String[] args) {
        Constructor con = new Constructor();
        System.out.println(con);
        System.out.println(con.value);

        System.out.println(Arrays.toString(con.array));

        Constructor con2 = new Constructor(12);
        System.out.println(Arrays.toString(con2.array));

        Constructor con3 = new Constructor();
        con3.setValue(200);
        con3.setArray(con.getArray());

        System.out.println(con3.getValue());
        System.out.println(Arrays.toString(con3.getArray()));
    }

}
