import java.util.ArrayList;

public class Gudang {
    ArrayList<Barang> daftarBarang;
    double kapasitasMaxGudang;
    
    public Gudang(double kapasitasMaxGudang) {
        this.daftarBarang = new ArrayList<Barang>();
        this.kapasitasMaxGudang = kapasitasMaxGudang;
    }
    
    public ArrayList<Barang> getDaftarBarang() {
        return daftarBarang;
    }
    
    public double getKapasitasMaxGudang() {
        return kapasitasMaxGudang;
    }
    
    public void addBarang(Barang barang) {
        daftarBarang.add(barang);
    }
}
