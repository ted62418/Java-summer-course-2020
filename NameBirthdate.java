import java.util.Scanner;  // Needed for Scanner class

/**
   Teresa Dreibelbis
   19 June 2020
   CPS 121 CRN 4191
   
   Purpose: collect name and birthdate from
   user and display results on user's screen.
*/

public class NameBirthdate
{
   public static void main(String[] args)
   {
      String firstName, lastName;   // User's name
      byte birthMonth, birthDay;    // User's birth month and day
      short birthYear;              // User's birth year
      
      // Set up scanner.
      Scanner keyboard = new Scanner(System.in);
    
      // Get first name from user.
      System.out.println("Please enter your first name: ");
      firstName = keyboard.nextLine();
      
      // Get last name from user.
      System.out.println("Please enter your last name: ");
      lastName = keyboard.nextLine();
      
      // Get birth month from user.
      System.out.println("Please enter your birth month: ");
      birthMonth = keyboard.nextByte();
      
      // Get birth day from user.
      System.out.println("Please enter your birth day: ");
      birthDay = keyboard.nextByte();
      
      // Get birth year from user.
      System.out.println("Please enter your birth year: ");
      birthYear = keyboard.nextShort();
      
      // Display results.
      System.out.println("Name: " + lastName + ", " + firstName);
      System.out.println("Birthday: " + birthMonth + " / " + 
                        birthDay + " / " + birthYear);
   }
}