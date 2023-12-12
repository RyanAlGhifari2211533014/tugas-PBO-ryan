import java.util.Scanner;
abstract class SuperMarket {
    String supermarketName;
    String cashier;
    Scanner scan = new Scanner(System.in);

    SuperMarket(String name, String cashier) {
        this.supermarketName = name;
        this.cashier = cashier;
    }

    void displaySupermarketInfo() {
        System.out.println("-------NEIN ELEVEN-------");
        System.out.println("========================");
        System.out.print("Kasir    : ");
        cashier = scan.nextLine();
        System.out.println("\n========================");
    }
}