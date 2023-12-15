import java.util.Scanner;

public class PRAK302_2210817310012_NIZARALI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah negara: ");
        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            System.out.println("Masukkan nama negara: ");
            String negara = scanner.nextLine();

            System.out.println("Masukkan jenis kepemimpinan (presiden, raja, dll.): ");
            String jabatan = scanner.nextLine();

            System.out.println("Masukkan nama pemimpin: ");
            String nama = scanner.nextLine();

            System.out.println("Apakah Anda ingin memasukkan tanggal kemerdekaan? (ya/tidak)");
            String inputTanggal = scanner.nextLine();

            if (inputTanggal.equalsIgnoreCase("ya")) {
                System.out.println("Masukkan tanggal kemerdekaan (format: dd mm yyyy): ");
                int tanggal = scanner.nextInt();
                int bulan = scanner.nextInt();
                int tahun = scanner.nextInt();
                scanner.nextLine();  // Consume newline left-over

                printInfo(negara, jabatan, nama, tanggal, bulan, tahun);
            } else {
                printInfo(negara, jabatan, nama);
            }
        }

        scanner.close();
    }

    public static void printInfo(String negara, String jabatan, String nama, int tanggal, int bulan, int tahun) {
        System.out.println("Negara " + negara + " mempunyai " + jabatan + " bernama " + nama);
        System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggal + " " + getBulan(bulan) + " " + tahun);
        System.out.println();
    }

    public static void printInfo(String negara, String jabatan, String nama) {
        System.out.println("Negara " + negara + " mempunyai " + jabatan + " bernama " + nama);
        System.out.println();
    }

    public static String getBulan(int bulan) {
        String[] bulanIndonesia = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return bulanIndonesia[bulan - 1];
    }
    }


