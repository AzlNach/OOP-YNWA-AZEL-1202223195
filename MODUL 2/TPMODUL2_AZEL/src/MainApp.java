public class MainApp {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("M1", 120.0, 5, 4);
        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║              Informasi Mobil                ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        System.out.println(mobil.toString());
        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║       Waktu Tempuh dengan Bus: " + mobil.hitungWaktuTempuh(300) + " jam      ║");
        System.out.println("╚═════════════════════════════════════════════╝");

        Bus bus = new Bus("B1", 80.0, 40, 30);
        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║               Informasi Bus                 ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        System.out.println(bus.toString());
        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║       Waktu Tempuh dengan Bus: " + bus.hitungWaktuTempuh(300) + " jam     ║");
        System.out.println("╚═════════════════════════════════════════════╝");
    }
}
