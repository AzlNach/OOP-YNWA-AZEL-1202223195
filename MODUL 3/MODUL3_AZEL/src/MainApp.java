import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    private static final boolean InputMismatchException = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bioskop bioskop = new Bioskop();
        bioskop.displaySeating();
        // TO DO : Create a Scanner object to receive input from the user
        System.out.println("=============Silakan Register===========");
        String input_nama = scanner.nextLine();
        int input_hp = scanner.nextInt();
        scanner.nextLine();

        // TO DO : Create Bioskop and Cashier objects
        Bioskop bioskop1 = new Bioskop();
        bioskop1.displaySeating();
        
        // TO DO : Take the name from the user, make sure it is not empty
        System.out.println("===================");
        System.out.println("Registrasi Berhasil");
        User user = new User();
        user.register(input_nama,input_hp);

        // TO DO : Take the phone number from the user, make sure it is valid
        

        // TO DO : Create a code for ticket order
        boolean pengulangan = false;
        while (!pengulangan) {
            try{
                System.out.print("Pilih Baris kursi");
                int pesan_ticket_baris= scanner.nextInt();
                scanner.nextLine();
                System.out.print("Pilih Baris kolom");
                int pesan_ticket_kolom = scanner.nextInt();
                scanner.nextLine();

            // TO DO : Create a exception if user enter not number
            }catch(InputMismatchException){
                System.out.println("Input harus angka");
                // TO DO : Create a exception if user enter number is out of range
             }catch(ArrayIndexOutOfBoundsException){
                System.out.println("Input anda harus berada dalam range");
             }catch(exception){
                System.out.println();
             }
            

        

        // TO DO : Call the method to reserve seats in the cinema
        bioskop1.bookSeat(pesan_ticket_baris, pesan_ticket_baris);
            
        // TO DO : Close the Scanner object when the user is finished   
        scanner.close();
    }
}