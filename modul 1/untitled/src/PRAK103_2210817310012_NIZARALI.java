import java.util.Scanner;

public class PRAK103_2210817310012_NIZARALI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int n = scanner.nextInt();
        System.out.print("Masukkan bilangan awal: ");
        int awal = scanner.nextInt();

        int i = awal;
        int baris = 1; // Tambah variabel pencacah baris

        do {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                // Periksa kelipatan 5 dan kondisi cetak
                if (baris % 5 == 0) {
                    System.out.println();
                }
                baris++;
            }
            i++; // Increment i terlepas dari bilangan ganjil
        } while (baris <= n); // Update kondisi perulangan

        scanner.close();
    }
}
