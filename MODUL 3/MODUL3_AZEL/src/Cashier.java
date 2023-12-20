public class Cashier extends Bioskop {
    public boolean isBooked;

    public Cashier(boolean isBooked ){
        this.isBooked = isBooked ;
    }
    // TO DO : Create a method to print ticket
    public void printTicket(User user) {
        public void displaySeating(int row,int seat) {
            boolean isBooked = false ;
            for (int i = 0 ; i < super.tempat_kursi[i].length;i++){
                for(int j =0 ; j<super.tempat_kursi[j].length;j++){
                    if (!( i == 0 &&  j ==5 && i == 1 &&  j ==5 && i == 7 &&  j ==3)){
                            if (super.tempat_kursi[i][j]== 1){
                                isBooked = true;
                                System.out.println("Memesan tiket.....");
                                System.out.println("=====================");
                                System.out.println(super.register);
                                System.out.println("Kursi berhasil dipesan :"+i+1+","+j+1);
                    }else {
                        System.out.println("Anda belum memesan tiket");
                        isBooked = false ;
                    }
                }
                
            }
                
        }
    }


}

