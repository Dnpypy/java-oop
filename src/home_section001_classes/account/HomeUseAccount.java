package home_section001_classes.account;

public class HomeUseAccount {

    public static void main(String[] args) {
        HomeAccount account1 = new HomeAccount();
        account1.setName("Sasha");
        account1.setAddress("street");
        account1.setBalance(1000.555);

        account1.display();
        double procent = account1.getInterest(5.00);
        System.out.printf( "%.2f",procent);

        System.out.println(account1.getName());
    }
}
