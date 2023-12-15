package uts;


import java.util.Scanner;

public class utspbo_soal9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // read the input values
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        // calculate the discounted price
        double discountedPrice = x * (100 - y) / 100.0;

        // calculate the final price
        double finalPrice = discountedPrice * (100 + z) / 100.0;

        // print the final price
        System.out.println((int) finalPrice);
    }
}