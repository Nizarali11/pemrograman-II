package Soal2;

public class Main {
    public static void main(String[] args) {
        // Untuk memilih jenis hewan, Anda bisa menggunakan input scanner
        // Misalnya, jika pengguna memilih 1 (Kucing)
        Kucing kucing = new Kucing("lolo", "Anggora", "abu-abu");
        kucing.display();

        // Jika pengguna memilih 2 (Anjing)
        Anjing anjing = new Anjing("andi", "cihuahua", "berenang, berjabat tangan, melompat");
        anjing.display();
    }
}