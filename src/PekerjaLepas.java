// PekerjaLepas.java
public class PekerjaLepas extends Pekerja implements Tugas {
    private int jumlahJamKerja;
    private double upahPerJam;

    public PekerjaLepas(String nama, String id, int jumlahJamKerja, double upahPerJam) {
        super(nama, id); // Memanggil konstruktor superclass Pekerja
        this.jumlahJamKerja = jumlahJamKerja;
        this.upahPerJam = upahPerJam;
    }

    @Override
    public double hitungGaji() {
        return jumlahJamKerja * upahPerJam;
    }

    @Override
    public void laksanakanTugas() {
        System.out.println(nama + " (Pekerja Lepas) sedang menyelesaikan proyek.");
    }
}