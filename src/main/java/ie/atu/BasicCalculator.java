package ie.atu;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        //Prompt a number
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please Enter first number: ");

        //Enter first number
        double firstNumber = scan1.nextDouble();
        System.out.println(firstNumber);

        //Enter second number
        System.out.println("Please Enter second number: ");
        double secondNumber = scan1.nextDouble();
        System.out.println("You entered:" + secondNumber);

        double sum = firstNumber + secondNumber;
        System.out.println("The sum is:" +sum);
    }
}
