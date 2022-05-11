//Mortgage Calculator

package com.caitlin;

import java.text.NumberFormat;
import java.util.Scanner;

//public access, class Main
public class Main {

    public static void main(String[] args) {
//constants
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
//asking our first question, removing ln to type inline with question
        System.out.print("What is your Principal: ");
        int principal = scanner.nextInt();

        System.out.print("What is your Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("How many years: ");
        byte years =  scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
