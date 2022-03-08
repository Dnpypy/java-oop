package academy.devonline.java.home_section001_classes.account;

public class HomeUseAccount {

    public static void main(String[] args) {
        HomeAccount account1 = new HomeAccount();
        account1.setName("Den");
        account1.setAddress("1100");
        account1.setBalance(11223.112);

        HomeAccount account2 = new HomeAccount();
        account2.setName("Yas");
        account2.setAddress("1500");
        account2.setBalance(22231.112);

        account1.display();
        System.out.print(", плюс $");
        System.out.printf("%4.2f" ,account1.getInterest(5));

        System.out.println();
        account2.display();
        System.out.print(", плюс $");
        System.out.printf("%4.2f" , account2.getInterest(15));

        System.out.println(account1.getName());
        System.out.println(account1.getAddress());
        System.out.println(account1.getBalance());

        System.out.println(account2.getName());
        System.out.println(account2.getAddress());
        System.out.println(account2.getBalance());

        System.out.println("Hello");
    }
}
