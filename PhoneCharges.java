import javax.swing.JOptionPane;

/**
   Teresa Dreibelbis
   27 June 2020
   CPS 121 CRN 4191
   
   Purpose: to help customer comare prices of 3 phone carriers
   based on current usage
*/

public class PhoneCharges
{
   public static void main(String[] args)
   {
      double abcCo;             // AB & C phone company
      double horizonCo;         // Horizon phone company
      double tintCo;            // Tint phone company
      double minutesMonth;      // Number of call minutes used per month
      double textsMonth;        // Number of texts sent per month
      String input;             // To hold user input
      
      // Get number of minutes used per month.
      input = 
         JOptionPane.showInputDialog("How many minutes do you " +
            "spend making calls each month? Enter your answer here.");
      minutesMonth = Double.parseDouble(input);
      
      // Get number of texts sent per month.
      input = 
            JOptionPane.showInputDialog("How many texts do you " +
             "send per month? Please enter that number here.");
      textsMonth = Double.parseDouble(input);
      
      // Calculate charges for AB & C.
      // Flat rate = 5/month. Minutes: 100 free + .03/min. Texts: .05 each.
      abcCo = 5 + ((minutesMonth - 100) * .03) + (textsMonth * .05);
      
      // Calculate charges for Horizon.
      // Flat: 10. Min: 200 free, .05/min. Texts: .03.
      horizonCo = 10 + ((minutesMonth - 200) * .05) + (textsMonth * .03);
      
            
      // Calculate charges for Tint.
      // Flat: 30. Min: 400 free, .02/min. Texts:.01.
      tintCo = 30 + ((minutesMonth - 400) * .02) + (textsMonth * .01);
      
      //Format string.
      String output = String.format("AB & C costs $%.2f\n Horizon " +
            "costs $%.2f\n Tint costs $%.2f\n", abcCo, horizonCo, tintCo);
            
      // Display the results.
      JOptionPane.showMessageDialog(null, output);
         
      System.exit(0);
   }
}