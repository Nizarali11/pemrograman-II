package uts;

import java.util.Scanner;

import java.util.Scanner;

public class utspbo_soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numCases = input.nextInt();
        input.nextLine();  // Membaca karakter newline setelah angka pertama

        for (int i = 0; i < numCases; i++) {
            String word1 = input.nextLine().trim();  // Menghilangkan spasi tambahan
            String word2 = input.nextLine().trim();  // Menghilangkan spasi tambahan

            System.out.println(word1);
            System.out.println(word2);

            String pattern = getPattern(word1, word2);
            System.out.println(pattern);
            System.out.println();
        }
    }

    public static String getPattern(String word1, String word2) {
        StringBuilder pattern = new StringBuilder();

        if (word1.length() != word2.length()) {
            return "Panjang kata tidak sama.";
        }

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                pattern.append('.');
            } else {
                pattern.append('*');
            }
        }

        return pattern.toString();
    }
}
