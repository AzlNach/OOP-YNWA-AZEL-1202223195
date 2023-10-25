import java.util.List;
import java.util.ArrayList;

public class Database {

    // TODO: Create List of Konser Object to Store Konser from Konser Class
    ArrayList<Konser> LisKonser;

    public Database (ArrayList<Konser> LisKonser){
        this.LisKonser = new ArrayList<>();
    }


    // TODO: Create Method to insert Konser to Database

    public void insertKonser(Konser konser){
        LisKonser.add(konser);
    }
    // TODO: Create Method to Show Konser from Database
     public void ShowKonser(){
        System.out.println("Daftar Acara yang Tersedia :");
        System.out.println("Nama band :" + Konser.getNama_Band());
        System.out.println("Tanggal :" + Konser.getTanggal());
        System.out.println("Lokasi :" + Konser.getLokasi());
        System.out.println("Harga Tiket :" + Konser.getBalance());


    // TODO: Create Method to Buy Ticket and Show the Total Price
        
     public void beliticket(){
        System.out.println("Piliahan nomor yang dibeli");
        System.out.println("Jumlah ticket yang dibeli:");
    
     }
}
