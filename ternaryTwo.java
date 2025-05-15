package nightPractice;

import java.util.Random;
import java.util.Scanner;

public class ternaryTwo {

    public static void main(String [] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        double halfRate = random.nextDouble(0.15,0.45);



        System.out.println("Please input your Savings : ");
        int savings = scanner.nextInt();

        System.out.println("Enter your yearly Income : ");
        int income = scanner.nextInt();


        if(savings > income ){
            double total =  (savings > income ) ? 0.45: 0.15;
            System.out.printf("You are a low Risk and a High saver! with %.2f interest", total);
        }
        else if(savings < income){
            double total =  (income < savings ) ? 0.45: 0.15;
            System.out.printf("You are at a Higher Risk and should improve your savings!\n We can Offer you: %.2f", total );
        }

        else if(savings == income && savings != 0){
            System.out.printf("We can provide you a loan at %.2f", halfRate);
        }

        else if(income == savings && income != 0){
            System.out.printf("We can provide you a loan at %.2f", halfRate);
        }

        else if(income == 0  && savings == 0){
            System.out.print("Thank you! Kindly apply when  you have a form of (income) or (savings)? ");
        }

        else if (income > 100000 || savings > 120000){
            System.out.println("Loan approved ");
        }

        else{
            System.out.println("Please input an amount!");
        }

        scanner.close();
    }







}
