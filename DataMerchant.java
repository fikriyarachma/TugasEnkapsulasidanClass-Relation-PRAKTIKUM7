/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class DataMerchant {
    static Merchant merch[] = new Merchant[0];
    
    public static Merchant[] tambahMerchant(Merchant merchant) {
        Merchant n[] = new Merchant[DataMerchant.merch.length+1];
        
        for (int i = 0; i < DataMerchant.merch.length; i++) {
            n[i] = DataMerchant.merch[i];
        }
        n[DataMerchant.merch.length] = merchant;
        return n;
    }
    
    public static void tampilData() {
        for (Merchant merch1 : DataMerchant.merch) {
         System.out.println("=== Tampilan Data Merchant UB Food ===");
         System.out.println("Nama Merchant  : " + merch1.getNamaMerchant());
         System.out.println("Nama Produk    : " + merch1.getNamaProduk());
         System.out.println("Harga Makanan  : " + (int) merch1.getHargaMakanan());
         System.out.println();
        }
    }
    
    public static Merchant cariMerchant(String nama) {
      for (int i = 0; i < DataMerchant.merch.length; i++) {
            if (nama.equalsIgnoreCase(DataMerchant.merch[i].getNamaMerchant()));
            return DataMerchant.merch[i];
        }
        return null;
    }
    
    public static void tampilMerchant(Merchant merchant) {
        System.out.println("Nama Merchant  : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk    : " + merchant.getNamaProduk());
        System.out.println("Harga Makanan  : " + (int) merchant.getHargaMakanan());
    }
    
    public static void updateMerchant(Merchant merchant, String upMerchant, String upProduk, double upHarga) {
        merchant.setNamaMerchant(upMerchant);
        merchant.setNamaProduk(upProduk);
        merchant.setHargaMakanan(upHarga);
        
    }
}
 
