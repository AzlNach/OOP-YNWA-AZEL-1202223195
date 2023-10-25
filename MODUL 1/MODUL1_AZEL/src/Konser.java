public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String Nama_Band;
    private String Tanggal;
    private String Lokasi ;
    private int Harga_Ticket ; 
    

    public void setNama_Band(String Nama_Band){
        this.Nama_Band = Nama_Band;
    }
    public void setTanggal(String Tanggal){
        this.Tanggal = Tanggal;
    }
    public void setLokasi(String Lokasi){
        this.Lokasi = Lokasi;
    }

    public void setHarga_Ticket(int Harga_Ticket){
        this.Harga_Ticket= Harga_Ticket;
    }


    public String getNama_Band(){
        return Nama_Band;
    }
    
    public String getTanggal(){
        return Tanggal;
    }

    public String getLokasi(){
        return Lokasi;
    }

    public Integer getHarga_Ticket(){
        return Harga_Ticket;
    }
}

