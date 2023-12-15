package uts;

import java.util.Scanner;

public class utspbo_soal10 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int userCount, years, months;
        userCount = inputScanner.nextInt();
        inputScanner.nextLine();

        for (int i = 0; i < userCount; i++) {
            String[] birthDateStr = inputScanner.nextLine().split(" ");
            String monthStr = birthDateStr[0];
            int birthYear = Integer.parseInt(birthDateStr[1]);

            int birthMonth = 0;

            switch (monthStr) {
                case "Januari" -> birthMonth = 1;
                case "Februari" -> birthMonth = 2;
                case "Maret" -> birthMonth = 3;
                case "April" -> birthMonth = 4;
                case "Mei" -> birthMonth = 5;
                case "Juni" -> birthMonth = 6;
                case "Juli" -> birthMonth = 7;
                case "Agustus" -> birthMonth = 8;
                case "September" -> birthMonth = 9;
                case "Oktober" -> birthMonth = 10;
                case "November" -> birthMonth = 11;
                case "Desember" -> birthMonth = 12;
            }

            int currentYear = 2020;
            int currentMonth = 3;

            if (birthMonth > currentMonth || (birthMonth == currentMonth && birthYear > currentYear)) {
                years = currentYear - birthYear;
                months = birthMonth - currentMonth;
                if (months < 0) {
                    years--;
                    months += 12;
                }
            } else {
                years = currentYear - birthYear - 1;
                months = 12 - (currentMonth - birthMonth);
            }

            if (years == 0 && months == 0) {
                System.out.println("1 Tahun");
            } else if (months == 0) {
                System.out.println(years + " Tahun");
            } else {
                if (months == 12) {
                    months = 0;
                    years++;
                }
                if (years > 0) {
                    System.out.println(years + " Tahun" + (months > 0 ? " " + months + " Bulan" : ""));
                } else {
                    System.out.println(months + " Bulan");
                }
            }
        }
    }
}
