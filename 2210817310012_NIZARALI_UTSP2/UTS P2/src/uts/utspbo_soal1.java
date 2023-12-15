package uts;

public class utspbo_soal1 {
    public static void main(String[] args) {
        Tumbuhan tumbuhan1 = new Tumbuhan("matahari", "Bunga", 2);
        Tumbuhan tumbuhan2 = new Tumbuhan("Pohon Pinus", "Pohon", 5);

        System.out.println("Informasi Tumbuhan 1:");
        System.out.println("Nama: " + tumbuhan1.getNamaTumbuhan());
        System.out.println("Jenis: " + tumbuhan1.getJenisTumbuhan());
        System.out.println("Umur: " + tumbuhan1.getUmurTumbuhan() + " tahun");
        tumbuhan1.tumbuh();
        tumbuhan1.berbunga();
        System.out.println("\nInformasi Tumbuhan 2:");
        System.out.println("Nama: " + tumbuhan2.getNamaTumbuhan());
        System.out.println("Jenis: " + tumbuhan2.getJenisTumbuhan());
        System.out.println("Umur: " + tumbuhan2.getUmurTumbuhan() + " tahun");
        tumbuhan2.tumbuh();
        tumbuhan2.berbunga();
    }
}
