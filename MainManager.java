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