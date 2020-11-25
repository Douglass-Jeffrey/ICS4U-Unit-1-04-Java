/*
* The Microwave program implements an application that determines the amount 
* of time required to cook various amounts of different foods
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-11-24
* Class Microwave.
*/

import java.util.Scanner; // Import the Scanner class

public class Microwave {
  
  /**
   * This class calculates time needed to heat up a food item based on item 
   * type and number of items.
   */

  public static void main(String[] args) {
    
    double cooktime = 0;
    
    // Begins try statement
    try {
      // Create a Scanner object
      Scanner scan = new Scanner(System.in);

      //Accepts user input
      System.out.println("Enter the number of the food item you wish to heat"
                         + " up 1 For sub, 2 for pizza, or 3 for soup. ");
      // Read int input 
      int foodnumber = scan.nextInt();

      // Accepts user input
      System.out.println("Enter the number of food items you wish to heat up: "
                         + "1, 2 or 3");
      // Read int input 
      int foodamount = scan.nextInt();

      // Process
      if (foodnumber == 1) {
        cooktime = 60;
      } else if (foodnumber == 2) {
        cooktime = 45;
      } else if (foodnumber == 3) {
        cooktime = 105;
      } else {
        System.out.println("Invalid number selected");
        return;
      }

      if ((foodamount <= 3 && foodamount >= 1)) {
        cooktime = cooktime + 0.5 * (foodamount - 1) * cooktime;
      } else {
        System.out.println("Invalid quantity selected");
        return;
      }

      // Output
      System.out.println("cooktime in seconds: " + cooktime); 

    // Catches invalid inputs
    } catch (Exception e) {
      System.out.println();
      System.out.println();
      System.out.println("Invalid input. Please try again");
    }
  }
}
