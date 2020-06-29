import javax.swing.JOptionPane;    // Needed for JOptionPane

/**
   Teresa Dreibelbis
   19 June 2020
   CPS 121 CRN 4191
   
   Purpose: collect name and birthdate from
   user and display results on user's screen.
   This time, use dialog boxes.
*/

public class NameBirthdateDialog
{
   public static void main(String[] args)
   {
      String inputString;           // For reading input
      String firstName, lastName;   // User's name
      byte birthMonth, birthDay;    // User's birth month and day
      short birthYear;              // User's birth year
      
      
    
      // Get first name from user.
      firstName = JOptionPane.showInputDialog("Please " +
                  "enter your first name: ");
     
      
      // Get last name from user.
      lastName = JOptionPane.showInputDialog("Please " +
                 "enter your last name: ");
      
      // Get birth month from user.
      inputString = JOptionPane.showInputDialog("Please " +
                   "enter your birth month: ");
                   
      // Convert the input to a byte.
      birthMonth = Byte.parseByte(inputString);
      
      // Get birth day from user.
      inputString = JOptionPane.showInputDialog("Please " +
                 "enter your birth day: ");
                 
      // Convert the input to a byte.
      birthDay = Byte.parseByte(inputString);
      
      // Get birth year from user.
      inputString = JOptionPane.showInputDialog("Please " +
                  "enter your birth year: ");
      
      // Convert the input to a short.
      birthYear = Short.parseShort(inputString);
      
      // Display results.
      JOptionPane.showMessageDialog(null,"Name: " + lastName + ", " + 
      firstName + "\n Birthday: " + birthMonth + " / " + 
                        birthDay + " / " + birthYear);
   System.exit(0);
   }
}