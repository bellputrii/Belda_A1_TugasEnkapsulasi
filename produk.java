public class produk {

    private String namaProduk;
    private double hargaProduk;
    private int jumlahProduk;

    public produk(String namaProduk, double hargaProduk, int jumlahProduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.jumlahProduk = jumlahProduk;
    }

    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setHargaProduk(double hargaProduk){
        this.hargaProduk = hargaProduk;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }

    public void setJumlahProduk(int jumlahProduk){
        this.jumlahProduk = jumlahProduk;
    }
    public int getJumlahProduk() {
        return jumlahProduk;
    } 
} 