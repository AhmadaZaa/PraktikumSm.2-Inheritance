/*
Kelas mahasiswa merupakan kelas turunan dari Manusia dengan definisi sebagai berikut:
− nim : String
− ipk : double
+ setter, getter
+ getStatus() : String
+ getBeasiswa() : double
+ toString() : String
(Keterangan)
o Beasiswa untuk ipk 3.0 – 3.5 mendapat $50 dan untuk 3.5 – 4 mendapat $75
o Status untuk mendapatkan angkatan dan prodi (menurut kaidah FILKOM UB)
1651506XXXXXXX
o Digit ke 1-2 adalah angkatan
o Digit ke 7 adalah prodi
▪ 2 Teknik Informatika
▪ 3 Teknik Komputer
▪ 4 Sistem Informasi
▪ 6 Pendidikan Teknologi Informasi
▪ 7 Teknologi Informasi

Dengan pengembalian dengan format : prodi angkatan, contoh : Sistem
Informasi, 2017
o toString() menampilkan atribut induk + nim, ipk, dan status.
 */
public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    // Constructor
    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    // Setter and Getter
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public double getIpk() {
        return ipk;
    }
    
    // Method
    public String getStatus() {
        String angkatan = nim.substring(0, 2);
        char kodeProdi = nim.charAt(6);
        String prodi = "";

        switch (kodeProdi) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Tidak Diketahui";
        }
        return prodi + ", 20" + angkatan;
    }
    public double getBeasiswa() {
        if (ipk >= 3.5) {
            return 75;
        } else if (ipk >= 3.0) {
            return 50;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "NIM            : " + nim + "\n" +
               "IPK            : " + ipk + "\n" +
               "Status         : " + getStatus() + "\n" +
               "Beasiswa       : $" + getBeasiswa();
    }
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }
}