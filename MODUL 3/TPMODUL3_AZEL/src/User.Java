public class User {
    protected String Name;
    protected int id;

    public User(String Name,int id){
        this.Name = Name;
        this.id=id;
    }
    public String getUserDetail(){
        return "Name: " + Name + ", ID: " + id;
    }
}
