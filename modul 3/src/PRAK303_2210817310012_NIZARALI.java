import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PRAK303_2210817310012_NIZARALI {
    private static Map<String, String> mahasiswa = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (pilihan) {
                case 1:
                    tambahMahasiswa(scanner);
                    break;
                case 2:
                    hapusMahasiswa(scanner);
                    break;
                case 3:
                    cariMahasiswa(scanner);
                    break;
                case 4:
                    tampilkanMahasiswa();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }

    private static void tambahMahasiswa(Scanner scanner) {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        String nim = scanner.nextLine();

        mahasiswa.put(nim, nama);
        System.out.println("Mahasiswa " + nama + " ditambahkan.");
    }

    private static void hapusMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String nim = scanner.nextLine();

        if (mahasiswa.containsKey(nim)) {
            mahasiswa.remove(nim);
            System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    private static void cariMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
        String nim = scanner.nextLine();

        if (mahasiswa.containsKey(nim)) {
            System.out.println("NIM: " + nim + ", Nama: " + mahasiswa.get(nim));
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    private static void tampilkanMahasiswa() {
        if (mahasiswa.isEmpty()) {
            System.out.println("Daftar Mahasiswa kosong.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Map.Entry<String, String> entry : mahasiswa.entrySet()) {
                System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
            }
        }
    }
}
