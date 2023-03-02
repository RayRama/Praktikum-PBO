public class Barang {
    String namaBarang, tujuanPengiriman;
    double beratBarang;
    
    public Barang(String namaBarang, String tujuanPengiriman, double beratBarang) {
        this.namaBarang = namaBarang;
        this.tujuanPengiriman = tujuanPengiriman;
        this.beratBarang = beratBarang;
    }
    
    public String getNama() {
        return namaBarang;
    }
    
    public String getTujuan() {
        return tujuanPengiriman;
    }
    
    public double getBerat() {
        return beratBarang;
    }
}
