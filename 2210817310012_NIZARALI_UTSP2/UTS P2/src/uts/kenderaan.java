package uts;

class Kendaraan {
    String jenisKendaraan;
    int dayaAngkutPenumpang;
    double dayaAngkutMuatan;

    public void NyalakanMesin() {
        System.out.println("Mesin dinyalakan");
    }

    public void MatikanMesin() {
        System.out.println("Mesin dimatikan");
    }

    public void Melaju() {
        System.out.println("Kendaraan melaju");
    }

    public void MemperlambatLaju() {
        System.out.println("Kendaraan memperlambat laju");
    }
}

class Mobil extends Kendaraan {
    int jumlahRoda;
    String tipeBahanBakar;

    public void Klakson() {
        System.out.println("Mobil berklakson");
    }

    public void GantiGigi() {
        System.out.println("Mobil mengganti gigi");
    }
}