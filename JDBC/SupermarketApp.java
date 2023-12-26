public class SupermarketApp {
    public static void main(String[] args) {

        LoginSystem login = new LoginSystem();
        login.inputLogin();

        String formattedDateTime = Date.getCurrentDateTime();
        System.out.println("Tanggal: " + formattedDateTime);

        Customer customer = new Customer(null, null, null, null, 0);
        customer.displaySupermarketInfo();
        
        System.out.println("-----DATA PELANGGAN-----");
        customer.inputCustomerData();

        Purchase purchase = new Purchase("NEIN ELEVEN", "Squidward");
        System.out.println("--DATA PEMBELIAN BARANG-");
        purchase.inputPurchaseData();

        purchase.displayPurchaseData();
    }
}
