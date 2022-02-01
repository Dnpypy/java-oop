package home_section001_classes;

public class HomeUseAccount {
    public static void main(String[] args) {
        HomeAccount guest1 = new HomeAccount();
        guest1.name = "D";
        guest1.address = "110";
        guest1.balance = 100;

        HomeAccount guest2 = new HomeAccount();
        guest2.name = "A";
        guest2.address = "111";
        guest2.balance = 1111;

        guest1.display();
        guest2.display();
    }
}
