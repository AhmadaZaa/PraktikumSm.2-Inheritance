/*
Kelas Pekerja merupakan kelas turunan dari Manusia dengan definisi sebagai berikut:
− gaji : double
− tahunMasuk : LocalDate
− jumlahAnak : int
+ setter, getter
+ getBonus() : double
+ getGaji() : double
+ toString() : String
(Keterangan)
o Bonus didapatkan oleh pegawai sesuai lama bekerja :
o Jika lama bekerja 0 – 5 tahun, maka bonus sebesar 5% dari gaji
o Jika lama bekerja 5 – 10 tahun, maka bonus sebesar 10% dari gaji
o Jika lebih dari 10 tahun, maka bonus sebesar 15% dari gaji
o Tunjangan ditambah apabila memiliki anak, yaitu $20 per anak.
o toString() menampilkan atribut induk + tahun masuk, jumlah anak, dan gaji.
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    // Constructor
    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    // Getter dan Setter
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // Hitung bonus berdasarkan lama kerja
    public double getBonus() {
        long lamaKerja = ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
        if (lamaKerja < 5) {
            return gaji * 0.05;
        } else if (lamaKerja < 10) {
            return gaji * 0.10;
        } else {
            return gaji * 0.15;
        }
    }

    // Total pendapatan (gaji + bonus + tunjangan anak + tunjangan menikah dari parent)
    public double getGajiTotal() {
        double tunjanganAnak = jumlahAnak * 20;
        return gaji + getBonus() + tunjanganAnak + super.getTunjangan();
    }

    // Override pendapatan untuk pakai getGajiTotal
    @Override
    public double getPendapatan() {
        return getGajiTotal();
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                "\nTahun Masuk    : " + tahunMasuk +
                "\nJumlah Anak    : " + jumlahAnak +
                "\nGaji Total     : $" + getGajiTotal();
    }
}