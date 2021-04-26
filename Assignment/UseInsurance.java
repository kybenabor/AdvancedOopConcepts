package Assignment;

import java.util.Scanner;

public class UseInsurance {
    private static Scanner input;

	public static void main(String args[]) {
       
    	int insurance;
    	
        input = new Scanner(System.in);
        System.out.println(" Please Select the Insurance type \n 1. Life Insurance \n 2. Health Insurance");
        String userInput =input.next();
        insurance =Integer.parseInt(userInput);
        
        if (insurance == 1)
           insuranceLife();
        else
           insuranceHealth();
    }
   
    public static void insuranceLife() {
        Life life = new Life();
        life.setCost();
        life.display();
    }
   
    public static void insuranceHealth() {
        Health health = new Health();
        health.setCost();
        health.display();
    }
}
