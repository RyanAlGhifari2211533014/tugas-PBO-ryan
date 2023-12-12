import java.util.InputMismatchException;
import java.util.Scanner;

class Customer extends SuperMarket implements iCustomerData {
    String customerName;
    String customerAddress;
    int customerNoHP;
    boolean input = true;
    Scanner scanner = new Scanner(System.in);

    Customer(String name, String address, String marketName, String cashier, int nohp) {
        super(marketName, cashier);
        this.customerName = name;
        this.customerAddress = address;
        this.customerNoHP = nohp;
    }
    @Override
    public void inputCustomerData() {
        System.out.print("Nama Pelanggan     : ");
        customerName = scanner.nextLine();
        System.out.print("Alamat             : ");
        customerAddress = scanner.nextLine();
       do {
            try {
                System.out.print("Nomor HP           : ");
                customerNoHP = scanner.nextInt();
                input = false;
            } catch (InputMismatchException e) {
                System.out.println("bukan angka, coba lagi");
                scanner.next();
            }
        } while (input);
    }
    
}