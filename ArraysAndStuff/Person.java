
public class Person
{
    private String[] name; 
    private int age;
    public Person() {
        this.name = new String[] {null, null, null};
        this.age = 0;
    }
    public Person(String[] arrayName, int agePerson) {
        this.name = arrayName;
        this.age = agePerson;
    }
    public String toString() {
        return (name[0] + " " + name[1] + " " + name[2] + " is " + age + " years old.");
    }
}
