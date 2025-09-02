// PekerjaTetap.java
public class PekerjaTetap extends Pekerja implements Tugas {
    private double gajiBulananTetap;

    public PekerjaTetap(String nama, String id, double gajiBulananTetap) {
        super(nama, id); // Memanggil konstruktor superclass Pekerja
        this.gajiBulananTetap = gajiBulananTetap;
    }

    @Override
    public double hitungGaji() {
        return gajiBulananTetap;
    }

    @Override
    public void laksanakanTugas() {
        System.out.println(nama + " (Pekerja Tetap) sedang melaksanakan tugas rutin.");
    }
}