package home_section001_classes.account;

public class HomeUseAccount {

    public static void main(String[] args) {
        HomeAccount account1 = new HomeAccount();
        account1.name = "Den";
        account1.address = "1101";
        account1.balance = 1234.55;

        account1.display();
    }
}
