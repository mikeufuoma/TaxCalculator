package com.michael;

import com.michael.processors.TaxProcessor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the annual Amount:");
        int income = scanner.nextInt();
        TaxProcessor processor = new TaxProcessor(income);
        processor.printBreakDown();
    }

}
