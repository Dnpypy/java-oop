package home_section001_classes;

/**
 * Создать класс HomeUseAccount, в нем создать точку входа метод main
 * В классе HomeUseAccount создать два объекта HomeAccount у каждого объекта свое имя, адрес, баланс
 * В класс HomeAccount добавить метод dipslay() который выводит данные по такому шаблону:
 * имя адрес имеет на счету баланс $ баланс
 * В классе HomeUseAccount вывести информацию через метод display() по такому шаблону: имя адрес имеет на счету $ баланс
 * Удалить решение
 */
public class HomeAccount {
    String name;
    String address;
    double balance;

    void display() {
        System.out.println(name + " " + address + " имеет на счету " + balance + "$ баланс");
    }
}
