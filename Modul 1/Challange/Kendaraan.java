public class Kendaraan {
    String jenisKendaraan;
    double kapasitasMax, kapasitasSaatIni;
    
    public Kendaraan(String jenisKendaraan, double kapasitasMax) {
        this.jenisKendaraan = jenisKendaraan;
        this.kapasitasMax = kapasitasMax;
        this.kapasitasSaatIni = 0;
    }
    
    public String getJenisKendaraan() {
        return jenisKendaraan;
    }
    
    public double getKapasitasMax() {
        return kapasitasMax;
    }
    
    public double getKapasitasSaatIni() {
        return kapasitasSaatIni;
    }
    
    public void tambahKapasitas(double beratBarang) {
        kapasitasSaatIni += beratBarang;
    }
}
