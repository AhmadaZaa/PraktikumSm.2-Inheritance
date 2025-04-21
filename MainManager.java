import java.time.LocalDate;

public class MainManager {
    public static void main(String[] args) {
        Manager manajer2 = new Manager(
            "Pak Manager", true, "3402020202020008", true,
            7500, LocalDate.now().minusYears(15), 2,
            "Teknologi Informasi"
        );

        System.out.println("==== Data Manajer ====");
        System.out.println(manajer2);
    }
}
/*
Perhitungan Pendapatan:
Gaji Pokok: $7500

Bonus (karena kerja 15 tahun): 15% dari $7500 = $1125

Tunjangan Anak (2 anak): 2 × $20 = $40

Tunjangan Suami (karena menikah dan laki-laki): $25

Tunjangan Manager (10% dari gaji): 10% × $7500 = $750

Total Pendapatan:
7500 + 1125 + 40 + 25 + 750 = $9440
 */