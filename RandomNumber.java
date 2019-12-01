
package random.number;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Random num = new Random();
        Scanner input =new Scanner(System.in);
        int number =1+ num.nextInt(+100);
        System.out.println("Enter the guessed number");
        int guessnum =input.nextInt();
        int counter =0;
        
        do{counter +=1;
            if (number < guessnum){
                System.out.println("Too high, try again." );
                guessnum =input.nextInt();
            }
                else if (number > guessnum){
                 System.out.println("Too low, try again." );
                 guessnum =input.nextInt();
                }
        }while(number !=guessnum );
                System.out.println("Tis is the right number");
                System.out.println("The number of tries = "+counter);
        
    }
    
}
