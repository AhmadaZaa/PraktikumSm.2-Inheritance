/*
Kelas Manager merupakan kelas turunan dari Pekerja dengan definisi sebagai berikut:
− departemen : String
+ setter, getter
(Keterangan)
o Tunjangan ditambah sebesar 10% dari gaji.
o toString() menampilkan atribut induk + departemen.
 */

public class Manager extends Pekerja {
    private String departemen;

    // Constructor
    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah,
                   double gaji, java.time.LocalDate tahunMasuk, int jumlahAnak,
                   String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    // Setter & Getter
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    // Override getPendapatan() untuk menambahkan bonus manager (10% dari gaji)
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (getGaji() * 0.1);
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString() +
               "\nDepartemen     : " + departemen + "\n";
    }
}