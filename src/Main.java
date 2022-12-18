/*
*@Author Emircan Aktaş - 18.Dec.2022
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Basic Calculator Program for Switch-Case.

        Scanner inp  = new Scanner(System.in);
        double number1, number2;
        int select;
        System.out.println("Enter first number :");
        number1 = inp.nextDouble();

        System.out.println("Enter second number :");
        number2 = inp.nextDouble();


        System.out.println("**********************");
        System.out.println("1-Addition\n" +
                "2-Subtraction\n" +
                "3-Multiplication\n" +
                "4-Division");
        System.out.println("**********************");
        System.out.println("Your choice :");

        select  = inp.nextInt();
        switch(select){
            case 1:
                System.out.println(number1 + " + "+ number2 + " = " +(number1+number2));
                break;
            case 2:
                System.out.println(number1 + " - "+ number2 + " = " +(number1-number2));
                break;
            case 3:
                System.out.println(number1 + " * "+ number2 + " = " +(number1*number2));
                break;
            case 4:
                 System.out.println(number1 + " / "+ number2 + " = " +(number1/number2));
                 break;

        }


    }
}