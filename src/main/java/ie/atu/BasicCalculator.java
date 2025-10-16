package ie.atu;

import java.util.Scanner;

public class BasicCalculator
{
    public static void main(String[] args)
    {
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

        //switch statement
        System.out.println("Please choose an operation:\n Add; Sub; Mult, Dev");
        String operation = scan1.next();


        double result = switch(operation)
        {

            case "add" ->
            {
                yield firstNumber + secondNumber;
            }
            case "sub" ->
            {
                yield firstNumber - secondNumber;
            }
            case "mult" ->
            {
                yield firstNumber * secondNumber;
            }
            case "dev" ->
            {
                if(secondNumber != 0)
                {
                    yield firstNumber / secondNumber;

                }else
                {
                    System.out.println("You can't divide by zero");
                    yield 0;
                }
            }
            default ->
            {
                System.out.println("Wrong Entry.");
                yield 0;
            }


        };
        System.out.println("the Result is: " + result);

    }
}
