import java.util.ArrayList;

public class keranjang {
    int jumlahproduk = 0;
    static ArrayList<produk> listProduk = new ArrayList<>();

    public keranjang() {
     listProduk = new ArrayList<>();
    }

    void tambahproduk(produk produk) {
        if (hitungTotalJumlah() + produk.getJumlahProduk() <= 5) {
            listProduk.add(produk);
            System.out.println("Produk berhasil ditambahkan.");
        } else {
            System.out.println("Wes too, Keranjange wes mbludhag!!");
        }
    }

    private int hitungTotalHarga() {
        int totalHarga = 0;
        for (produk produk : listProduk) {
            totalHarga += produk.getHargaProduk() * produk.getJumlahProduk();
        }
        return totalHarga;
    }

    int hitungTotalJumlah() {
        int totalJumlah = 0;
        for (produk produk : listProduk) {
            totalJumlah += produk.getJumlahProduk();
        }
        return totalJumlah;
    }
    
    void tampilkanKeranjang() {
        System.out.println("Jumlah barang di keranjang: " + hitungTotalJumlah()); 
        System.out.println("Barang di dalam keranjang:");
        for (int i = 0; i < listProduk.size(); i++) { 
            System.out.println("# " + listProduk.get(i).getNamaProduk() + ", jumlah : " + listProduk.get(i).getJumlahProduk());
        }
        System.out.println("Total Harga Yang Harus di Bayar : " + hitungTotalHarga());
    }


}