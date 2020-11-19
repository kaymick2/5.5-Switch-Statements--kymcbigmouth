
//Kyle McDowell
//Methods and operations with math 
/** 
@version 1.1

I know this program is new, but it's a new version of 4.3
we're creating for lesson 5.5.

I want to add support for more than 2 inputs at some point.

have fun~
**/

import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter value for x:");
    int x = userInput.nextInt();
    System.out.println("Enter value for z");
    double z = userInput.nextDouble();

    /*
     * end of original program^ new program below
     */
    // creates menu
    System.out.println("---------------------");
    System.out.println("Please choose from the following math operators: ");
    System.out.println("1.Add ");
    System.out.println("2.Subtract");
    System.out.println("3.Multiply ");
    System.out.println("4.Divide ");
    System.out.println("5.Calculate the average");
    System.out.println("6.Calculate distance between inputs (absolute value of range)");
    System.out.println("7.Find the maximum");
    System.out.println("8.Find the minimum");
    System.out.println("--------------------");
    bigMath bigdog = new bigMath(x, z);

    int selection = userInput.nextInt();
    if (selection > 8) {
      System.out.println("Did you fall asleep on the bloody keyboard? Try again, mate.");
    } else
      ;

    switch (selection) {
    case 1:
      System.out.println("x + z = " + bigdog.addition(x, z));
      break;
    case 2:
      System.out.println("x - z =" + bigdog.subtraction(x, z));
      break;
    case 3:
      System.out.println("x*z = " + bigdog.multiplication(x, z));
      break;
    case 4:
      System.out.println("x/z = " + bigdog.division(x, z));
      break;
    case 5:
      System.out.println("the average of x and z = " + bigdog.average(x, z));
      break;
    case 6:
      System.out.println("The distance between x and z is = " + bigdog.distance(x, z));
      break;
    case 7:
      System.out.println("The maximum value is: " + bigdog.biggest(x, z));
      break;
    case 8:
      System.out.println("The minimum value is:" + bigdog.smallest(x, z));
      break;
    }

  }

}