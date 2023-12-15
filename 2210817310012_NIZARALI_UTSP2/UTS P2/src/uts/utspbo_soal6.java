package uts;

public class utspbo_soal6 {

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.jenisKendaraan = "Darat";
        mobil.dayaAngkutPenumpang = 5;
        mobil.dayaAngkutMuatan = 500.0;
        mobil.jumlahRoda = 4;
        mobil.tipeBahanBakar = "Bensin";

        System.out.println("Jenis kendaraan: " + mobil.jenisKendaraan);
        System.out.println("Daya angkut penumpang: " + mobil.dayaAngkutPenumpang);
        System.out.println("Daya angkut muatan: " + mobil.dayaAngkutMuatan);
        System.out.println("Jumlah roda: " + mobil.jumlahRoda);
        System.out.println("Tipe bahan bakar: " + mobil.tipeBahanBakar);

        mobil.NyalakanMesin();
        mobil.Klakson();
        mobil.Melaju();
        mobil.GantiGigi();
        mobil.MemperlambatLaju();
        mobil.MatikanMesin();
    }
}