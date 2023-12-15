package uts;

import java.util.*;

public class utspbo_soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputString = input.nextLine();

        int arnoldScore = 0;
        int bellaScore = 0;

        for (int i = 0; i < inputString.length(); i += 2) {
            char player = inputString.charAt(i);
            int points = Character.getNumericValue(inputString.charAt(i + 1));

            if (player == 'A') {
                arnoldScore += points;
            } else if (player == 'B') {
                bellaScore += points;
            }
        }

        if (arnoldScore > bellaScore) {
            System.out.println("Arnold, Skor : " + arnoldScore);
        } else if (bellaScore > arnoldScore) {
            System.out.println("Bella, Skor : " + bellaScore);
        } else {
            System.out.println("Seri, Skor : " + arnoldScore);
        }
    }
}