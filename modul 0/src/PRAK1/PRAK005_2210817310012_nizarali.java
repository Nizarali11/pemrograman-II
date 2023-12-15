package PRAK1;

import java.util.Scanner;

public class PRAK005_2210817310012_nizarali {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Makanan Favorit Anda: ");
        String makananFavorit = input.nextLine();

        System.out.print("Masukkan Hobi Anda: ");
        String hobi = input.nextLine();

        System.out.println("Aku Suka Makan " + makananFavorit + ", dan Hobiku " + hobi);

        input.close();
    }
}
