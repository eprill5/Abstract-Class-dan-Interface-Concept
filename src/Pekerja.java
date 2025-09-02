// Pekerja.java (Abstract Class)
public abstract class Pekerja {
    protected String nama;
    protected String id;

    public Pekerja(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    // Metode abstrak untuk menghitung gaji. Implementasi berbeda untuk setiap jenis pekerja.
    public abstract double hitungGaji();

    // Metode non-abstrak untuk menampilkan informasi umum pekerja
    public void tampilkanInfoPekerja() {
        System.out.println("Nama: " + nama + ", ID: " + id);
    }
}