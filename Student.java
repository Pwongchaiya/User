public class Student extends User{
    private float gpa;

    public Student(String name, boolean attendance, float gpa) {
        super(name, attendance);
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public void absent(){
        if (!getAttendance()){
            gpa -= .01;
        }
    }
}
