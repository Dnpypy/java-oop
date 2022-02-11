package home_section001_classes;

public class HomeUseAccount {

    public static void main(String[] args) {
        HomeAccount home1 = new HomeAccount();
        home1.name = "Denis";
        home1.address = "Street";
        home1.balance = 123.89;

        home1.display();
    }
}
