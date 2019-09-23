
public class studentDriver
{
    public static void main() {
        Student[] femaleStudents = new Student[7];
        Student[] maleStudents = new Student[7];
        String[] olderStudents = new String[7];
        femaleStudents[0] = new Student(10, "Alice");
        femaleStudents[1] = new Student(8, "Julie");
        femaleStudents[2] = new Student();
        femaleStudents[3] = new Student(9, "Carol");
        femaleStudents[4] = new Student();
        femaleStudents[5] = new Student(6, "Sophia");
        femaleStudents[6] = new Student(11, "Taylor");
        maleStudents[0] = new Student();
        maleStudents[1] = new Student(8, "Bob");
        maleStudents[2] = new Student();
        maleStudents[3] = new Student(10, "George");
        maleStudents[4] = new Student(11, "Bill");
        maleStudents[5] = new Student(7, "Georgie");
        maleStudents[6] = new Student(5, "Timmy");
        for (int i = 0; i < femaleStudents.length; i++) {
            int fgrade = femaleStudents[i].getGrade();
            int mgrade = maleStudents[i].getGrade();
            String fname = femaleStudents[i].getName();
            String mname = maleStudents[i].getName();
            if (fgrade > mgrade) {
                    olderStudents[i] = fname;
                } else if (mgrade > fgrade) {
                    olderStudents[i] = mname;
                } else {
                    if (Math.random() < 0.5) {
                        olderStudents[i] = mname;
                    } else {
                        olderStudents[i] = fname;
                    }
                    if (fname == null) {
                        olderStudents[i] = "Space to Rent";
                    }
                }
        }
        System.out.println("Female Name\tGrade\tMale Name\tGrade\tOlder Student");
        for (int n = 0; n < femaleStudents.length; n++) {
            System.out.println(femaleStudents[n].getName() + "\t\t" + femaleStudents[n].getGrade() + "\t" + maleStudents[n].getName() + "\t\t" + maleStudents[n].getGrade() + "\t" + olderStudents[n]);
        }
    }
}
