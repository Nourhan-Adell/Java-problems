package javaapplication2;

import java.util.Scanner;
public class JavaApplication2 {
    public static void main(String[] args) {
      Scanner calc = new Scanner(System.in);
      System.out.println("Enter the two numbers");
      System.out.println("First Number: ");
      int x = calc.nextInt();
      System.out.println("Second Number: ");
      int y = calc.nextInt();
      
      System.out.println("Choose an operation from the following: \n"
              + " 1)+ \n 2)- \n 3)* \n 4)/ \n 5)% \n 0)Exit the program \n");
      
     System.out.print("The operation number is:  ");
     int operations = calc.nextInt();
     System.out.print("The result is:  ");

           switch(operations){
          case 1: 
              System.out.println(x+y);
              break;
          case 2:
              System.out.println(x-y);
              break;
          case 3:
              System.out.println(x*y);
              break;
          case 4:
              System.out.println(x/y);
              break;
          case 5:
              System.out.println(x%y);
              break;
          case 6:
              System.out.println("Exit the program");
              break;
          default:
              System.out.println("Please choose a numbr from 0 to 5");
              
         }
      
    }
    
}
