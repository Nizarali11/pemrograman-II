package PRAK1;

import java.util.Scanner;

public class PRAK001_2210817310012_nizarali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        System.out.println("Selamat Pagi, " + nama);
        System.out.println("Selamat Siang, " + nama);
        System.out.println("Selamat Malam, " + nama);

        input.close();
    }
}
