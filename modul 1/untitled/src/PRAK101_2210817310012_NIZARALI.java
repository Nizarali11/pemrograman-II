import java.util.Scanner;

public class PRAK101_2210817310012_NIZARALI {

    public static void main(String[] args) {
        Scanner namy = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = namy.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = namy.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = namy.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = namy.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = namy.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        double tinggiBadan = namy.nextDouble();

        System.out.print("Masukkan Berat Badan: ");
        float beratBadan = namy.nextFloat();

        String namaBulan = "";
        switch (bulanLahir) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
        }

        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + namaBulan + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");

        namy.close();
    }
}
