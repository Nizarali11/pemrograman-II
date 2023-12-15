package PRAK1;
import java.util.Scanner;

public class PRAK002_2210817310012_nizarali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM Anda: ");
        String nim = input.nextLine();

        int panjangNama = nama.length();
        int panjangNIM = nim.length();

        int panjangMaks = Math.max(panjangNama, panjangNIM);
        int panjangTotal = panjangMaks + 4; // Panjang total termasuk pagar di kiri dan kanan

        String pagarAtasBawah = "#".repeat(panjangTotal);
        String pagarSamping = "#";

        System.out.println(pagarAtasBawah);
        System.out.println(pagarSamping + " "  + " ".repeat(panjangMaks) + " " + pagarSamping);
        System.out.println(pagarSamping + " " + " ".repeat((panjangMaks - panjangNama) / 2) + nama + " ".repeat((panjangMaks - panjangNama + 1) / 2) + " " + pagarSamping);
        System.out.println(pagarSamping + " " + " ".repeat((panjangMaks - panjangNIM) / 2) + nim + " ".repeat((panjangMaks - panjangNIM + 1) / 2) + " " + pagarSamping);
        System.out.println(pagarSamping + " "  + " ".repeat(panjangMaks) + " " + pagarSamping);
        System.out.println(pagarAtasBawah);

        input.close();
    }
}
