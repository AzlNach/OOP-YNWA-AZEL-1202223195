public class FRIExpress extends Ekspedisi//...
{
    // TO DO: Create Protected Attribute of FRIExpress (pecahBelah)
    protected boolean pecahBelah;

    // TO DO: Create Constructor of FRIExpress
    public FRIExpress(int jumlahCabang,String pusat,float  tarif,boolean pecahBelah){
        super(jumlahCabang, pusat, tarif);
        this.pecahBelah = pecahBelah ;
    }

    // TO DO: Create 'informasi' Method to show Information
    public void informasi(){
        System.out.println("\nEkspedisi FRIExpress dengan jumlah cabang "+jumlahCabang+" dan berpusat di "+pusat+ " mempunyai tarif sebesar "+tarif+ " perkilo");
        
        if(pecahBelah == true) {
            System.out.println("Selain itu ,ekpedisi ini melayani paket pecah belah");
        }
        else{
            System.out.println("Selain itu ,ekpedisi ini tidak melayani paket pecah belah");
        }
    }

    // TO DO: Create 'terima' Method to accept a number of packages
    public void terima(int jumlahPaket){
        System.out.println("FRIExpress baru saja menerima paket yang masuk untuk disortis sebanyak "+jumlahPaket+" paket");
    }
    // TO DO: Create 'kirim' Method to send a package to a destination
    public void kirim(String tujuan){
        System.out.println("FRIExpress berhasil mengirim paket dengan tujuan "+tujuan);
    }
    // TO DO: Create 'kirim' Method to send a package to two destinations
    public void kirim(String tujuan_1,String tujuan_2){
        System.out.println("FRIExpress berhasil mengirim paket dengan tujuan "+tujuan_1 +" dan "+tujuan_2);
    }
}
