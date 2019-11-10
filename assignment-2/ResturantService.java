package resturant.service;

import java.util.Scanner;
public class ResturantService {

    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter the number of people in the party");
        int people = calc.nextInt();
        System.out.println("Enter the amount of money");
        float money = calc.nextFloat();
        
        if(people >= 10){
            System.out.println((money*0.15)+money);
        }else{
            System.out.println(money);
        }
        
        


    }
    
}
