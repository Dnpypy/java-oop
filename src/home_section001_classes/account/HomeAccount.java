package home_section001_classes.account;

/**
 * Создать класс HomeUseAccount, в нем создать точку входа метод main
 * В класс HomeAccount создать поля name; address;double balance;
 * В классе HomeUseAccount создать два объекта HomeAccount у каждого объекта свое имя, адрес, баланс
 * добавить метод dipslay() который выводит данные по такому шаблону:
 * имя адрес имеет на счету баланс $ баланс
 * В классе HomeUseAccount вывести информацию через метод display() по такому шаблону:
 * имя адрес имеет на счету $ баланс
 * Добавить в класс HomeAccount метод getInterest вычисляющий процентную ставку balance * num/100.0
 * Сократить значение до двух знаков после запятой
 * Попробовать сделать поля класса HomeAccount приватными
 * Создать геттер и сеттер получить доступ к полям.
 * Generate... или alt+insert создать геттеры, можно сразу к многим полям.
 * Удалить решение
 */
public class HomeAccount {
    private String name;
    private String address;
    private double balance;

    void display() {
        System.out.println(name + " " + address + " имеет на счету$ " + balance);
    }

    double getInterest(double percentageRate) {
        return this.balance * percentageRate / 100.0;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBalance(double bal) {
        balance = bal;
    }
}
