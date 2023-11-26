public class Kendaraan {
   private String nomorIdentifikasi;
   private double kecepatanMaksimum;
   private int kapasitasPenumpang;

   //Constructornya
   Kendaraan(String nomorIdentifikasi,double kecepatanMaksimum,int kapasitasPenumpang){
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
   }
   
   // Methodnya
   public String toString() {
    return "Nomor Identifikasi: " + nomorIdentifikasi + "\n" +
           "Kecepatan Maksimum: " + kecepatanMaksimum + " km/jam\n" +
           "Kapasitas Penumpang: " + kapasitasPenumpang + " orang";
   }

   public double hitungWaktuTempuh(double jarak) {
    return jarak / kecepatanMaksimum;
   }
}
