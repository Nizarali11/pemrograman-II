package PRAK201_2210817310012_NIZARALI;

public class main {
    public static void main(String[] args) {
        Fruit apel = new Fruit("Apel", 0.4, 7000.0, 40.0);
        Fruit mangga = new Fruit("Mangga", 0.2,3500.0, 15.0);
        Fruit alpukat = new Fruit("Alpukat", 0.25, 10000.0, 12.0);
        apel.display();
        mangga.display();
        alpukat.display();
    }
}
