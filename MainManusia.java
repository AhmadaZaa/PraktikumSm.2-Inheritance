public class MainManusia {
    public static void main(String[] args) {
        // a. Laki-laki telah menikah
        Manusia a = new Manusia("Budi", true, "1234567890", true);
        System.out.println(a.toString());
        System.out.println();

        // b. Perempuan telah menikah
        Manusia b = new Manusia("Siti", false, "9876543210", true);
        System.out.println(b.toString());
        System.out.println();

        // c. Belum menikah (bebas mau laki atau perempuan)
        Manusia c = new Manusia("Agus", true, "1122334455", false);
        System.out.println(c.toString());
    }  
}