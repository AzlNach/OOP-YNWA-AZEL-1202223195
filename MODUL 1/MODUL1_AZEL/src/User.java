public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String Name;
    private int No_Handphone;

    public void setName(String Name){
        this.Name= Name ;
    }

    public void setNo_Handphone(int No_Handphone){
        this.No_Handphone =No_Handphone;
    }


    public Integer getNo_Handphone(){
        return No_Handphone;
    }
    
    public String getName(){
        return Name;
    }
    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public User(String Name,int No_Handphone){
        this.Name = Name ;
        this.No_Handphone = No_Handphone ;
    }

    public void info(){
        System.out.println("Nama : " +Name);
        System.out.println("No Handphone : " +No_Handphone);
        System.out.println("--------------------------");
    }
}
