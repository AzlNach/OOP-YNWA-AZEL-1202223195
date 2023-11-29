public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi(10, "Jakarta", 10000);
        ekspedisi.informasi();

        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress telUExpress = new TelUExpress(100, "Bandung", 500000, true);
        telUExpress.informasi();
        telUExpress.ambil("Sukabirus");
        telUExpress.antar(1628389);
        telUExpress.antar(1922722,7628262);
        // TO DO: Create friexpress Object from FRIExpress Class

        FRIExpress friExpress =new FRIExpress(30, "Bojongsoang", 70000, false);
        friExpress.informasi();
        friExpress.terima(2000);
        friExpress.kirim("Lembang");
        friExpress.kirim("Braga","Rancaekek");


    }
}
