
public class Student
{
    // instance variables - replace the example below with your own
    private int grade;
    private String name;
    public Student(int myGrade, String myName)
    {
        name = myName;
        grade = myGrade;
    }
    public Student() {
        name = null;
        grade = 0;
    }
    public void setGrade(int myGrade) {
        grade = myGrade;
    }
    public void setName(String myName) {
        name = myName;
    }
    public void setNameGrade(int myGrade, String myName)
    {
        name = myName;
        grade = myGrade;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
}
