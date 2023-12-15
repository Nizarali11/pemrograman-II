
        import java.util.Random;
        import java.util.Scanner;

        public class PRAK301_2210817310012_NIZARALI {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Masukkan jumlah dadu: ");
                int jumlahDadu = input.nextInt();

                int totalNilaiDadu = 0;

                for (int i = 1; i <= jumlahDadu; i++) {
                    System.out.print("Dadu ke-" + i + " bernilai: ");
                    int nilaiDadu = input.nextInt();
                    totalNilaiDadu += nilaiDadu;
                }

                System.out.println("Total nilai dadu keseluruhan " + totalNilaiDadu);
            }
        }

