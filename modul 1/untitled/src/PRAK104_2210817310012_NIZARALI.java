import java.util.Scanner;

public class PRAK104_2210817310012_NIZARALI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input pilihan tangan Abu
        System.out.print("Tangan Abu: ");
        String tanganAbu = scanner.nextLine();

        // Input pilihan tangan Bagas
        System.out.print("Tangan Bagas: ");
        String tanganBagas = scanner.nextLine();

        // Inisialisasi variabel untuk menyimpan poin Abu dan Bagas
        int poinAbu = 0;
        int poinBagas = 0;

        // Perulangan untuk memeriksa setiap ronde
        for (int i = 0; i < tanganAbu.length(); i++) {
            // Mendapatkan pilihan tangan Abu dan Bagas pada ronde i
            char tanganAbuRondeI = tanganAbu.charAt(i);
            char tanganBagasRondeI = tanganBagas.charAt(i);

            // Menentukan pemenang ronde i
            String pemenangRondeI = menentukanPemenang(tanganAbuRondeI, tanganBagasRondeI);

            // Menambahkan poin pemenang ronde i
            if (pemenangRondeI.equals("Abu")) {
                poinAbu++;
            } else if (pemenangRondeI.equals("Bagas")) {
                poinBagas++;
            }
        }

        // Menentukan pemenang permainan
        String pemenangPermainan = menentukanPemenangPermainan(poinAbu, poinBagas);

        // Menampilkan hasil permainan
        System.out.println("Pemenang: " + pemenangPermainan);

        scanner.close();
    }

    private static String menentukanPemenang(char tanganAbu, char tanganBagas) {
        if (tanganAbu == 'B' && tanganBagas == 'G') {
            return "Abu";
        } else if (tanganAbu == 'G' && tanganBagas == 'K') {
            return "Abu";
        } else if (tanganAbu == 'K' && tanganBagas == 'B') {
            return "Abu";
        } else if (tanganAbu == tanganBagas) {
            return "Seri";
        } else {
            return "Bagas";
        }
    }

    private static String menentukanPemenangPermainan(int poinAbu, int poinBagas) {
        if (poinAbu > poinBagas) {
            return "Abu";
        } else if (poinBagas > poinAbu) {
            return "Bagas";
        } else {
            return "Seri";
        }
    }
}
