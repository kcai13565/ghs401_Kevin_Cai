import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class StringStuff
{
   public static void main() {
       JPanel panel = new JPanel();
       String school = JOptionPane.showInputDialog("Enter school name:");
       String mascot = JOptionPane.showInputDialog("Enter mascot name:");
       if ((school != null) && (mascot != null)) {
           if (school.equals("Granada") && mascot.equals("Matadors")) {
               String[] array = {"Bob", null, "Waldo", "Harry Potter"};
               for (int i = 0; i < array.length; i++) { 
                   if (array[i] != null) {
                       if (array[i].equals("Waldo")) {
                           System.out.print("You found Waldo.");
                       } else {
                           System.out.print("You found " + array[i] + ". This is not Waldo.");
                       }
                   } else {
                       System.out.print("You found " + array[i] + ". This is not Waldo.");
                   }
                   System.out.println("  Index was " + (i + 1) + ".");
               }
           } else {
               if (school.equals("Granada")) {
                   JOptionPane.showMessageDialog(panel, "Your mascot is incorrect. Please try again.","Mascot error",JOptionPane.ERROR_MESSAGE);
                   main();
               } else if (mascot.equals("Matadors")) {
                   JOptionPane.showMessageDialog(panel, "Your school is incorrect. Please try again.","School error",JOptionPane.ERROR_MESSAGE);
                   main();  
               } else {
                   JOptionPane.showMessageDialog(panel, "Your school and mascot is incorrect. Please try again.","Error",JOptionPane.ERROR_MESSAGE);
                   main();
               }
           }
       } else {
           if (school == null) {
                   JOptionPane.showMessageDialog(panel, "Your mascot is incorrect. Please try again.","Mascot error",JOptionPane.ERROR_MESSAGE);
                   main();
               } else if (mascot == null) {
                   JOptionPane.showMessageDialog(panel, "Your school is incorrect. Please try again.","School error",JOptionPane.ERROR_MESSAGE);
                   main();  
               } else {
                   JOptionPane.showMessageDialog(panel, "Your school and mascot is incorrect. Please try again.","Error",JOptionPane.ERROR_MESSAGE);
                   main();
               }
       }
    }
}
