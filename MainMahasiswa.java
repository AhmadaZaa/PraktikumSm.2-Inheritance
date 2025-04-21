public class MainMahasiswa {
        public static void main(String[] args) {
            // a. IPK < 3 (tidak dapat beasiswa)
            MahasiswaFILKOM a = new MahasiswaFILKOM("Ahmada", true, "245150707111007", false, "235150201111001", 2.8);
    
            // b. IPK 3.0 – 3.5 (dapat beasiswa $50)
            MahasiswaFILKOM b = new MahasiswaFILKOM("Putri", false, "245150707111008", true, "225150400111002", 3.4);
    
            // c. IPK 3.5 – 4 (dapat beasiswa $75)
            MahasiswaFILKOM c = new MahasiswaFILKOM("Ahza", true, "245150707111009", true, "245150707111007", 3.8);
    
            // Cetak semua data
            System.out.println("==== Mahasiswa IPK < 3 ====");
            System.out.println(a);
            System.out.println("\n==== Mahasiswa IPK 3.0 - 3.5 ====");
            System.out.println(b);
            System.out.println("\n==== Mahasiswa IPK 3.5 - 4.0 ====");
            System.out.println(c);
        }
}

/*
Penjelasan Singkat:

a: IPK-nya cuma 2.8, jadi dia belum dapat beasiswa 😢

b: IPK-nya 3.4, masuk range 3.0 – 3.5, jadi dia dapet beasiswa $50 💸

c: IPK-nya 3.8, cakep banget, dapet beasiswa $75 🎉

Dari NIM-nya juga otomatis terdeteksi angkatan dan prodi-nya. Misal:

235150201111001 ➜ angkatan 2023, prodi Teknologi Informasi (karena digit ke-7 = 7)

225150400111002 ➜ angkatan 2022, prodi Sistem Informasi (digit ke-7 = 4)

245150707111007 ➜ angkatan 2024, prodi Teknologi Informasi (digit ke-7 = 6)
 */