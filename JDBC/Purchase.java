import java.util.InputMismatchException;
import java.util.Scanner;

class Purchase extends SuperMarket implements iPurchaceData {
    String productCode;
    String productName;
    int productPrice;
    int quantity;
    double totalPayment;
    boolean input = true;

    Purchase(String marketName, String cashier) {
        super(marketName, cashier);
    }

    @Override
    public void inputPurchaseData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kode Barang   : ");
        productCode = scanner.nextLine();
        System.out.print("Nama Barang   : ");
        productName = scanner.nextLine();
        
        do {
            try {
                System.out.print("Harga Barang  : ");
                productPrice = scanner.nextInt();
                input = false;
            } catch (InputMismatchException e) {
                System.out.println("bukan angka, coba lagi");
                scanner.next();
            }
        } while (input);


       do {
            try {
                System.out.print("Jumlah Barang : ");
               quantity = scanner.nextInt();
                input = false;
            } catch (InputMismatchException e) {
                System.out.println("bukan angka, coba lagi");
                scanner.next();
            }
        } while (input);
       
        // Menghitung total bayar
        totalPayment = productPrice * quantity;
        scanner.close();
    }

    @Override
    public void displayPurchaseData() {
        System.out.println("------------------------");
        System.out.println("TOTAL BAYAR   : " + totalPayment);
        System.out.println("------------------------");
    }
    
}