public class Mobil extends Kendaraan {
    private int jumlahPintu;

    //Constructornya
    public Mobil(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahPintu) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahPintu = jumlahPintu;
    }

    // Methodnya
    @Override
    public String toString() {
        return super.toString() + "\nJumlah Pintu: " + jumlahPintu;
    }
}

