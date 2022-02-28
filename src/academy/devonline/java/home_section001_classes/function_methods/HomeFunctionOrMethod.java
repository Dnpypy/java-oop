package academy.devonline.java.home_section001_classes.function_methods;


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
        HomeFunctionOrMethod hf = new HomeFunctionOrMethod();
        System.out.println(hf.value);
        hf.value = 4;
        System.out.println(hf.value);
        hf.changeValue();
        System.out.println(hf.value);
        hf.changeValueOp();
        System.out.println(hf.value);
        hf.changeValueVal();
        System.out.println(hf.value);
    }
}
