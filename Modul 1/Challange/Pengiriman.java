import java.util.ArrayList;

public class Pengiriman {
    String tanggalPengiriman;
    ArrayList<Barang> daftarBarang;
    Kendaraan kendaraan;
    
    public Pengiriman(ArrayList<Barang> daftarBarang, Kendaraan kendaraan, String tanggalPengiriman) {
        this.daftarBarang = daftarBarang;
        this.kendaraan = kendaraan;
        this.tanggalPengiriman = tanggalPengiriman;
    }
    
    public ArrayList<Barang> getDaftarBarang() {
        return daftarBarang;
    }
    
    public Kendaraan getKendaraan() {
        return kendaraan;
    }
    
    public String getTanggalPengiriman() {
        return tanggalPengiriman;
    }
    
}
