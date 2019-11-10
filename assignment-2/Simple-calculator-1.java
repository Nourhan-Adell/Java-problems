
package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {
    
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Please enter the number of terms");
        //let the number of terms = N
        float N = calc.nextInt();
        System.out.println("Please enter the first term");
        //Let the first term = A
        float A = calc.nextFloat();
        
        System.out.println("Please enter the second term");
        //Let the second term = L
        float L = calc.nextFloat();
        
        float sum =(N/2)*(A+L);
        System.out.println(sum );
    }
    
}
