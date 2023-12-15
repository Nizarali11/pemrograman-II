package uts;

public class Tumbuhan {
    private String namaTumbuhan;
    private String jenisTumbuhan;
    private int umurTumbuhan;

    public Tumbuhan(String namaTumbuhan, String jenisTumbuhan, int umurTumbuhan) {
        this.namaTumbuhan = namaTumbuhan;
        this.jenisTumbuhan = jenisTumbuhan;
        this.umurTumbuhan = umurTumbuhan;
    }

    public String getNamaTumbuhan() {
        return namaTumbuhan;
    }

    public void setNamaTumbuhan(String namaTumbuhan) {
        this.namaTumbuhan = namaTumbuhan;
    }

    public String getJenisTumbuhan() {
        return jenisTumbuhan;
    }

    public void setJenisTumbuhan(String jenisTumbuhan) {
        this.jenisTumbuhan = jenisTumbuhan;
    }

    public int getUmurTumbuhan() {
        return umurTumbuhan;
    }

    public void setUmurTumbuhan(int umurTumbuhan) {
        this.umurTumbuhan = umurTumbuhan;
    }

    public void tumbuh() {
        umurTumbuhan++;
        System.out.println(namaTumbuhan + " tumbuh satu tahun. Umur sekarang: " + umurTumbuhan + " tahun.");
    }

    public void berbunga() {
        System.out.println(namaTumbuhan + " sedang berbunga.");
    }
}
