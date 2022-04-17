import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    :Fikriya Rachma Dewi");
        System.out.println("Nim     :215150600111008");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);

        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 8000));

        DataMerchant.tampilData();
        
        System.out.print("Ingin Buka Menu Program ? \n Y / N : ");
            String answer = scan.nextLine();
        if ("Y".equals(answer)) {
            System.out.println("\n Menu Program");
            System.out.println("1. Tambah Data");
            System.out.print("2. Update Data \nPilihan anda :");
            int choice = scan.nextInt();
            
            if (choice == 1) {
                System.out.println("------- Tambah Data -------");
                System.out.print("Masukkan Nama Merchant    : ");
                    String namaMerchant = scan.nextLine();
                    scan.nextLine();
                System.out.print("Masukkan Nama Produk      : ");
                    String namaProduk = scan.nextLine();
                System.out.print("Masukkan Harga Makanan    : ");
                    double harga = scan.nextDouble();
                System.out.println("----------------------------");
        
                DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant(namaMerchant,namaProduk,harga));
                System.out.println();
            } else if (choice == 2) {
                System.out.println("----------- Update Data -----------");
                System.out.print("Input merchant yang akan diupdate   : ");
                    String merchant = scan.nextLine();
                    scan.nextLine();
                System.out.print("Update nama merchant    : ");
                    String upMerchant = scan.nextLine();
                System.out.print("Update nama produk      : ");
                    String upProduk = scan.nextLine();
                System.out.print("Update harga            : ");
                    double upHarga = scan.nextDouble();
                System.out.println("-----------------------------------");
            
                DataMerchant.updateMerchant(DataMerchant.cariMerchant(merchant), upMerchant, upProduk, upHarga);
      
                System.out.println();
                System.out.println("========== DATA UPDATE ==========");
                DataMerchant.tampilMerchant(DataMerchant.cariMerchant(merchant));
                System.out.println("=================================");
            }
        } else {
            System.out.println("Anda Keluar, Terimakasih!");
        }
    }
}
