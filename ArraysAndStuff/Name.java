import javax.swing.JOptionPane;
public class Name
{
    public static void main() {
        String[] array1 = new String[3];
        String[] array2 = new String[3];
        array1[0] = JOptionPane.showInputDialog("Enter your first name");
        array1[1] = JOptionPane.showInputDialog("Enter your middle name");
        array1[2] = JOptionPane.showInputDialog("Enter your last name");
        int age1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        array2[0] = JOptionPane.showInputDialog("Enter your friend's first name");
        array2[1] = JOptionPane.showInputDialog("Enter your friend's middle name");
        array2[2] = JOptionPane.showInputDialog("Enter your friend's last name");
        int age2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your friend's age"));
        int name1 = 0;
        int name2 = 0;
        Person you = new Person(array1, age1);
        Person friend = new Person(array2, age2);
        System.out.println(you);
        System.out.println(friend);
        for (int i = 0; i < array1.length; i++) {
            name1 += array1[i].length();
            name2 += array2[i].length();
        }
        if (name1 > name2) {
            System.out.println("Your name is longer.");
        } else if (name2 > name1) {
            System.out.println("Your friend's name is longer.");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
