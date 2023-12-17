class Teacher extends User {

    public Teacher(String Name, int id) {
        super(Name, id);
    }

    public void teachClass(String course) {
        System.out.println("Pak " + Name + " is teaching " + course);
    }

    @Override
    public String getUserDetail() {
        return "Teacher - " + super.getUserDetail();
    }
}
