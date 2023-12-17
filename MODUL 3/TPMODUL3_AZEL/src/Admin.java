class Admin extends User {

    public Admin(String Name, int id) {
        super(Name, id);
    }

    public void manageSystem(String course) {
        System.out.println(Name + " is managing " + course);
    }

    @Override
    public String getUserDetail() {
        return "Admin - " + super.getUserDetail();
    }
}