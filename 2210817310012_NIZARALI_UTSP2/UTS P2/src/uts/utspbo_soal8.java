package uts;


import java.util.Scanner;

public class utspbo_soal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        if (N == 1) {
            System.out.println(0);
        } else if (N % 2 == 0) {
            int digit8Count = N / 2;
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < digit8Count; i++) {
                result.append("8");
            }
            System.out.println(result.toString());
        } else {
            int digit8Count = (N - 1) / 2;
            StringBuilder result = new StringBuilder("4");
            for (int i = 0; i < digit8Count; i++) {
                result.append("8");
            }
            System.out.println(result.toString());
        }
    }
}