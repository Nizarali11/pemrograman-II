package Soal2;

public class Anjing extends HewanPeliharaan {
    private String kemampuan;

    public Anjing(String nama, String ras, String kemampuan) {
        super(nama, ras);
        this.kemampuan = kemampuan;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki kemampuan : " + this.kemampuan);
    }
}
