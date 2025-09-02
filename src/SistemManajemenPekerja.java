// SistemManajemenPekerja.java (Main Class)
public class SistemManajemenPekerja {
    public static void main(String[] args) {
        System.out.println("--- Sistem Manajemen Pekerja ---");

        // Membuat objek PekerjaTetap
        PekerjaTetap pekerjaTetap1 = new PekerjaTetap("Budi Santoso", "PT001", 7500000.0);
        PekerjaTetap pekerjaTetap2 = new PekerjaTetap("Citra Dewi", "PT002", 6000000.0);

        // Membuat objek PekerjaLepas
        PekerjaLepas pekerjaLepas1 = new PekerjaLepas("Dion Pratama", "PL001", 120, 50000.0); // 120 jam @ Rp 50.000/jam
        PekerjaLepas pekerjaLepas2 = new PekerjaLepas("Elisa Putri", "PL002", 80, 60000.0); // 80 jam @ Rp 60.000/jam

        // Mengelola pekerja menggunakan referensi Abstract Class Pekerja
        Pekerja[] daftarPekerja = {pekerjaTetap1, pekerjaTetap2, pekerjaLepas1, pekerjaLepas2};

        System.out.println("\n--- Informasi dan Gaji Pekerja ---");
        for (Pekerja p : daftarPekerja) {
            p.tampilkanInfoPekerja(); // Metode dari Abstract Class
            System.out.println("Gaji: Rp" + String.format("%,.2f", p.hitungGaji())); // Metode abstrak yang diimplementasikan
            // Contoh: Casting untuk memanggil metode spesifik dari interface
            if (p instanceof Tugas) {
                ((Tugas) p).laksanakanTugas(); // Memanggil metode dari Interface
            }
            System.out.println("--------------------");
        }

        System.out.println("\n--- Simulasi Pelaksanaan Tugas ---");
        // Mengelola pekerja menggunakan referensi Interface Tugas
        Tugas[] daftarTugas = {pekerjaTetap1, pekerjaLepas1, pekerjaTetap2}; // Hanya beberapa yang dimasukkan

        for (Tugas t : daftarTugas) {
            t.laksanakanTugas(); // Memanggil metode dari Interface
        }
    }
}