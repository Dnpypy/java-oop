package home_section001_classes;

public class HomeUseAccount {
    public static void main(String[] args) {
        HomeAccount d1 = new HomeAccount();
        d1.name = "Denis";
        d1.address = "110";
        d1.balance = 778;

        HomeAccount d2 = new HomeAccount();
        d2.name = "Yasm";
        d2.address = "110";
        d2.balance = 1178;

        d1.display();
        d2.display();
    }
}
