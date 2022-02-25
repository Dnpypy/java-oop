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
 * Создать еще один объект и вывести значение полей,
 * массив по умолчанию и с передачей фактических параметров
 *
 * 4.Еще вариант: полям присвоить значения и размеры в свойствах, не в конструкторе
 * Оставить один конструктор с параметром size, создать объект, попробовать передать аргумент размер массива
 * Если не понятно тут(№142 урок)
 *
 * 5. Прописать в конструкторе по умолчанию вызов конструктора из консруктора
 *   с помощью ключевого слова this и передать туда размер массива(№144 урок)
 */

public class Constructor {

    private double number = 100.0;
    private String[] words = new String[15];

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public Constructor(){
        this(12);
    }
    public Constructor(int size) {
        words = new String[size];
    }

    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        System.out.println(Arrays.toString(constructor1.words));

    }
}
