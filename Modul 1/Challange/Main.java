/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

// Challange studi kasus pengiriman barang

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    // initial Barang(namaBarang, tujuanPengiriman, beratBarang)
		Barang barang1 = new Barang("Barang 1", "Indramayu", 8.0);
		Barang barang2 = new Barang("Barang 2", "Bandung", 2.0);
		Barang barang3 = new Barang("Barang 3", "Cirebon", 1.0);
		Barang barang4 = new Barang("Barang 4", "Bikini Bottom", 10.0);
		
		// add Barang ke list daftar barang
        ArrayList<Barang> daftarBarang = new ArrayList<Barang>();
        daftarBarang.add(barang1);
        daftarBarang.add(barang2);
        daftarBarang.add(barang3);
        daftarBarang.add(barang4);
        
        // initial Kendaraan(jenisKendaraan, kapasitasKendaraan)
        Kendaraan kendaraan = new Kendaraan("Pesawat Kargo", 2000.0);
        
        // initial Pengiriman(daftarBarang, kendaraan, tanggalPengiriman)
        Pengiriman pengiriman = new Pengiriman(daftarBarang, kendaraan, "2 Maret 2023");
        
        // add semua barang ke gudang(kapasitasGudang)
        Gudang gudang = new Gudang(1000.0);
        gudang.addBarang(barang1);
        gudang.addBarang(barang2);
        gudang.addBarang(barang3);
        gudang.addBarang(barang4);
        
        System.out.println("Daftar barang yang ada di gudang: ");
        for (Barang barang: gudang.getDaftarBarang()) {
            System.out.println("- " + barang.getNama() + "; " + barang.getBerat() + " KG; " + "Tujuan " + barang.getTujuan());
        }
        
        System.out.println("Daftar pengiriman barang: ");
        for (Barang barang: gudang.getDaftarBarang()) {
            System.out.println("- " + barang.getNama() + "; Diangkut menggunakan " + kendaraan.getJenisKendaraan() + "; Akan dikirim pada " + pengiriman.getTanggalPengiriman());
        }
	}
}
