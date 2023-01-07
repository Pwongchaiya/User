public class User {
    private String name;
    private boolean attendance;

    public User(String name, boolean attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }

    public void absent(){
        if (attendance){
            System.out.println("User is present");
        }else {
            System.out.println("User is not here");
        }
    }
}
