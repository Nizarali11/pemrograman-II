package uts;

import java.util.Scanner;

public class utspbo_soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] dice = new int[n];

        for (int i = 0; i < n; i++) {
            dice[i] = input.nextInt();
        }

        int max = -1;
        int index = -1;
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (dice[i] == dice[j]) {
                    count++;
                }
            }
            if (count == 1) {
                if (dice[i] > max) {
                    max = dice[i];
                    index = i + 1;
                    uniqueCount = 1;
                } else if (dice[i] == max) {
                    uniqueCount++;
                }
            }
        }

        if (uniqueCount == 1) {
            System.out.println(index);
        } else {
            System.out.println("Tidak ada pemenang");
        }
    }
}
