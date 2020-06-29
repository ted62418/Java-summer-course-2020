import javax.swing.JOptionPane;

/**
   Teresa Dreibelbis
   28 June 2020
   CPS 121 CRN 4191
   
   Purpose: Figure out shipping costs and surcharges 
   according to specs that the customer submits through 
   input dialog.
*/

public class FedUps
{
   public static void main(String[] args)
   {
      double zipCode,          // ZIP code of user
             weight,           // Weight of package
             length,           // Length of package
             width,            // Width of package
             height,           // Height of package
             volume,           // Volume of package 
             shipCost;         // Shipping cost, based on dimensions
        int  firstDigit,       // First digit of ZIP code
             lastDigit;        // Last digit of ZIP code
      double surCost,          // Surcharges, based on ZIP code
             sur1,             // ZIP code surcharge 1
             sur2,             // Surcharge if ZIP is even 
             totalCost;        // Cost of shipping plus surcharges
          String input;        // To contain user input
          
    // Get information from the user.
         
         // Get ZIP code.
         input = 
               JOptionPane.showInputDialog("What is your ZIP code?");
         firstDigit = input.charAt(0);
         lastDigit = input.charAt(4);
         zipCode = Double.parseDouble(input);
         
         
         // Get weight of package.
         input = 
               JOptionPane.showInputDialog("How much does the package " +
                "weigh, in pounds? Please respond with a decimal.");
         weight = Double.parseDouble(input);
         
         // Get length of package.
         input = JOptionPane.showInputDialog("How long is the " +
               "package, in inches? Please respond with a decimal.");
         length = Double.parseDouble(input);
         
         // Get width of package.
         input = JOptionPane.showInputDialog("How wide is the " +
                 "package? Please enter a decimal.");
         width = Double.parseDouble(input);
               
         // Get height of package.
         input = JOptionPane.showInputDialog("What is the height of " + 
                 "the package? Please enter a decimal.");
         height = Double.parseDouble(input);
         
         
         // Volume equation
         volume = length * width * height;
         
   // Find shipping costs based on dimensions of package
         //If weight, else volume. This determines basic 
         // price prior to surcharges.
         
         if (weight <= 5)
             shipCost = 10.00;
         else
               if (volume > 5 && volume <= 15)
                     shipCost = 12.00;
               else if (volume > 15 && volume <= 30)
                     shipCost = 14.00;
               else if (volume > 30 && volume <= 45)
                     shipCost = 16.00;
               else if (volume > 45 && volume <= 60)
                     shipCost = 17.00;
               else
                     shipCost = 25.00;
                     
    // Find surcharges, dependent on ZIP
         // The first one depends on the first number
         // This was found after the user entered their ZIP code.
         
         if (firstDigit == 4)
               sur1 = 1.05;
         else if (firstDigit == 6)
               sur1 = 1.07;
         else 
               sur1 = 1.09;
         
         // Find whether or not ZIP code is odd.
         // This is done using lastDigit, if it's 0, 2, 4 ,6, or 8.
         
         if (lastDigit == 0)
            sur2 = .02;
         else if (lastDigit == 2)
            sur2 = .02;
         else if (lastDigit == 4)
            sur2 = .02;
         else if (lastDigit == 6)
            sur2 = .02;
         else if (lastDigit == 8)
            sur2 = .02;
         else 
            sur2 = .0; 
         
        // Find total surcharge.
        surCost = sur1 + sur2;
        
   //Come up with final cost equation
      totalCost = shipCost * surCost;
      
      // Format totalCost for placement in dialog using 
      // format string method
      String output = String.format("Your ZIP code is %d" +
            ", the weight of your package is %f, the " +
            "length is %f, the width is %f, and the " +
            "height is %f.\n Based on this, the shipping " +
            " cost is $%.2f and the surcharge is $%.2f.\n" +
             "The total cost is $%.2f.\n", zipCode, weight, 
             length, width, height, shipCost, surCost);
             
      // Display output
      JOptionPane.showMessageDialog(null, output);
      
      System.exit(0);
    }
 }
