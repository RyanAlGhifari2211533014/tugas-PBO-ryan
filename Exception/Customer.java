import java.util.Scanner;

class Customer extends SuperMarket implements iCustomerData {
    String customerName;
    String customerAddress;
    Scanner scanner = new Scanner(System.in);

    Customer(String name, String address, String marketName, String cashier) {
        super(marketName, cashier);
        this.customerName = name;
        this.customerAddress = address;
    }

    @Override
    public void inputCustomerData() {
        System.out.print("Nama Pelanggan : ");
        customerName = scanner.nextLine();
        System.out.print("Alamat         : ");
        customerAddress = scanner.nextLine();

    }
    
}