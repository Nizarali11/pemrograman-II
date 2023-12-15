package uts;

import java.util.*;

public class utspbo_soal4  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputString = input.nextLine();

        String[] words = inputString.split("[*-]");

        StringBuilder outputString = new StringBuilder();

        for (String word : words) {
            outputString.append(word.charAt(0));
        }

        System.out.println(outputString);
    }
}