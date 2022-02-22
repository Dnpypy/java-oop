package home_section001_classes.constructor;

/**
 * 137-140
 * Создать конструктор класса
 * Создать точку входа
 * Прописать приватное поле value любого типа
 * В конструктор инициализировать поле любым значением
 * Создать объект и вывести значения поля value
 *
 * Создать приватное поле с статич массивом
 * Инициализировать его размер по умолчанию в конструторе
 * Инициализировать его, указываем размер который нам нужен в другом конструкторе
 *
 * Создать геттеры и сеттеры к полям
 * Создать еще один объект и вывести значение полей,
 * массив по умолчанию и с передачей фактических параметров
 */
public class Constructor {

    private int value;

    private int[] result;

    public Constructor () {
        value = 100;
        result = new int[15];
    }


    public Constructor (int size) {
        result = new int[size];
    }

    public static void main(String[] args) {
        Constructor cnst = new Constructor();
        System.out.println(cnst.value);
    }
}
