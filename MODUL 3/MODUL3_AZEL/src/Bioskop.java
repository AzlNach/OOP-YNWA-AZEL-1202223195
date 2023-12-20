public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private static int rows = 5;
    
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private static int seats_per_rows = 10;
    
    // TO DO: Create 2 dimensional array to store seat reservation status
    public int [][] tempat_kursi = new int[rows][seats_per_rows];

    public char[] register;
    
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        tempat_kursi[0][2]=1;
        tempat_kursi[1][5]=1;
        tempat_kursi[7][3]=1;
       
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        for (int i = 0 ; i < rows;i++){
            for(int j =0 ; j<seats_per_rows;j++){
                System.out.print(tempat_kursi[i][j]+" ");
            }System.out.println();
        }

    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if(row >= 0 && row < rows && seat >= 0 && seat<rows){
            if(tempat_kursi[row][seat]==0){
                tempat_kursi[row][seat]=1;
                System.out.printf("Kursi berhasil dipesan :"+row,","+seat);
            }else{
                System.out.println("Kursi sudah disiisi");
            }
        }else{
            System.out.println("Input invalid");
        }
        
    }
}