public class User {
   
   
   // TO DO: Create Private Attributes of User (nama, noHandphone)
   private String nama ;
   private int noHandphone;
   
   // TO DO: Create Constructor of User
   
   public void setName(String nama) {
         this.nama = nama ;

      }

   public void setNoHandPhone(int noHandphone) {
         this.noHandphone=noHandphone;
      }
   // TO DO: Create register Method to show information about name and phone number
   public void register(String input_nama, int input_hp){
      System.out.println("Nama :"+nama+"\n"
                        +"No Handphone :" + noHandphone);
        
    }
   // TO DO: Create method to return name and phone number
   
   public String getName() {
      return nama;
     
  }

   public int getnoHandPhone() {
      return noHandphone;
     
  }
}






  