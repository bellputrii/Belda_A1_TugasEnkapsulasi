public class Main {
    public static void main(String[] args) {

        produk produk1 = new produk("Beras", 5000, 1);  
        produk produk2 = new produk("Sabun", 10000.0, 2);
        produk produk3 = new produk("Sampo", 5000.0, 2);
        produk produk4 = new produk("Gula", 15000.0, 3);

        keranjang keranjang= new keranjang();
        keranjang.tambahproduk(produk1);
        keranjang.tambahproduk(produk2);
        keranjang.tambahproduk(produk3);
        keranjang.tambahproduk(produk4);

        int jumlahproduk = 0;  
        for (produk produk : keranjang.listProduk) {
            jumlahproduk += produk.getJumlahProduk();  
        }

        System.out.println("Jumlah barang di keranjang: " + jumlahproduk);

        System.out.println("\n======================================\n");
        
        keranjang.tampilkanKeranjang();

}
}