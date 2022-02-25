package academy.devonline.java.home_section001_classes.account;

/**
 * Создать класс HomeUseAccount, в нем создать точку входа метод main
 * В класс HomeAccount создать поля name; address;double balance;
 * В классе HomeUseAccount создать два объекта HomeAccount у каждого объекта свое имя, адрес, баланс
 *
 * Добавить в класс HomeAccount метод dipslay() который выводит данные по такому шаблону:
 * имя адрес имеет на счету баланс $ баланс
 *
 * В классе HomeUseAccount вывести информацию через метод display() по такому шаблону:
 * имя адрес имеет на счету $ баланс
 *
 * Добавить в класс HomeAccount метод getInterest вычисляющий процентную ставку balance * num/100.0
 * Сократить значение до двух знаков после запятой
 * Сделать поля класса HomeAccount приватными
 *
 * Создать геттер и сеттер получить доступ к полям.
 * Generate... или alt+insert создать геттеры, можно сразу к многим полям.
 *
 * Вывести все поля под отдельности
 * Удалить решение
 */

public class HomeAccount {
    private String name;
    private String address;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void display() {
        System.out.print(name + " " + address + " имеет на счету " + balance + " $ баланс");
    }

    double getInterest(int percentageRate) {
        return balance * percentageRate / 100.0;
    }
}
