import java.time.LocalDate;

public class MainPekerja {
    public static void main(String[] args) {
        // Test case a: Lama bekerja 2 tahun, anak 2
        Pekerja a = new Pekerja(
                "Dimas", true, "3501010101010001", true,
                2000, LocalDate.now().minusYears(2), 2
        );
        System.out.println("==== Pekerja A ====");
        System.out.println(a);
        System.out.println();

        // Test case b: Lama bekerja 9 tahun, tidak punya anak
        Pekerja b = new Pekerja(
                "Rina", false, "3501010101010002", true,
                2500, LocalDate.now().minusYears(9), 0
        );
        System.out.println("==== Pekerja B ====");
        System.out.println(b);
        System.out.println();

        // Test case c: Lama bekerja 20 tahun, anak 10
        Pekerja c = new Pekerja(
                "Pak Budi", true, "3501010101010003", true,
                3000, LocalDate.now().minusYears(20), 10
        );
        System.out.println("==== Pekerja C ====");
        System.out.println(c);
    }
}

/*
Penjelasan
Test Case A: Dimas sudah kerja 2 tahun → bonus 5% dari gaji ($100). 
Punya 2 anak → tunjangan anak $40. Tambah tunjangan menikah laki-laki $25.

Test Case B: Rina sudah kerja 9 tahun → bonus 10% dari gaji ($250).
Tidak punya anak, tapi ada tunjangan menikah perempuan $20.

Test Case C: Pak Budi sudah kerja 20 tahun → bonus 15% dari gaji ($450).
Punya 10 anak → tunjangan anak $200. Tambah tunjangan menikah laki-laki $25.
 */