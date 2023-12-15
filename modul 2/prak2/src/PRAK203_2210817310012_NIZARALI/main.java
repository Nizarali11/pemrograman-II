package PRAK203_2210817310012_NIZARALI;

import PRAK203_2210817310012_NIZARALI.Pegawai;

public class main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        p1.umur = 17;

        System.out.println("Nama: " + p1.nama);
        System.out.println("Asal: " + p1.asal);
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}