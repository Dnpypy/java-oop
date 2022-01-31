package home_section001_classes;


/**
 * lesson 98
 * Поменять состояние объекта класса HomeFunctionOrMethod
 * Поменять значение поля value на 67 или на любой другой число
 * Удалить решение
 */
public class HomeFunctionOrMethod {
    int value;

    void changeValue() {
        value = 67;
    }

    void changeValueOp() {
        value = 77;
    }

    void changeValueVal() {
        value = 87;
    }

    public static void main(String[] args) {
        HomeFunctionOrMethod hm = new HomeFunctionOrMethod();
        System.out.println(hm.value);
        hm.changeValue();
        System.out.println(hm.value);
        hm.changeValueOp();
        System.out.println(hm.value);
        hm.changeValueVal();
        System.out.println(hm.value);
    }
}
