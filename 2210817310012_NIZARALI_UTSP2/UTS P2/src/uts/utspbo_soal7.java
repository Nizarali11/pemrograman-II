package uts;


import java.util.Scanner;

public class utspbo_soal7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        char character = input.next().charAt(0);
        int digit = input.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print(digit);
                } else {
                    System.out.print(character);
                }
            }
            System.out.println();
        }
    }
}