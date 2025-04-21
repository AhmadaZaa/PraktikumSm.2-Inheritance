/*
Kelas manusia merupakan kelas induk dengan definisi sebagai berikut:
− nama : String
− jenisKelamin : boolean (true : laki-laki, false : perempuan)
− nik : String
− menikah : boolean
+ setter, getter
+ getTunjangan() : double
+ getPendapatan() : double
+ toString() : String
(Keterangan)
o Tunjangan untuk yang telah menikah adalah apabila laki-laki akan mendapat $25
sedangkan perempuan mendapat $20.
o Tunjangan untuk yang belum menikah adalah $15 .
o toString() menampilkan nama, nik, jenis kelamin, dan jumlah pendapatan.
 */
public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true: laki-laki, false: perempuan
    private String nik;
    private boolean menikah; // true: menikah, false: belum menikah

    // Constructor
    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    // Setter and Getter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNik() {
        return nik;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    public boolean getMenikah() {
        return menikah;
    }
    // Method
    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) {
                return 25; // laki-laki
            } else {
                return 20; // perempuan
            }
        } else {
            return 15; // belum menikah
        }
    }
    public double getPendapatan() {
        return getTunjangan();
    }
    
    @Override
    public String toString() {
        return "Nama           : " + nama + "\n" +
               "NIK            : " + nik + "\n" +
               "Jenis Kelamin  : " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\n" +
               "Status         : " + (menikah ? "Sudah" : "Belum") + " Menikah\n" +
               "Pendapatan     : $" + getPendapatan();
    }
}