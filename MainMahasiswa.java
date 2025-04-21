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