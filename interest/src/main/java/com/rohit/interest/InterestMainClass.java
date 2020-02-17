package com.rohit.interest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class InterestMainClass {
	public void RunInterestCalculator() throws IOException {
   	Scanner input = new Scanner(System.in);
        
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        log.write("Enter Principle");
        log.flush();
        
    	int principle = input.nextInt();
    	log.write("Enter Rate");
        log.flush();
    	
    	int rate = input.nextInt();
    	log.write("Enter Time");
    	log.flush();
    	int time = input.nextInt();
    	
    	log.write("Enter 1 For Simple Interest, 2 For Compount Interest");
    	log.flush();
    	int select = input.nextInt();
    	switch(select){
    	case 1:
    		SimpleInterest simple_interest1 = new SimpleInterest();
        	simple_interest1.setValues(principle, rate, time);
        	double simpleInterest =simple_interest1.findSimpleInterest();
        	log.write("Simple Interest int integer "+(int)simpleInterest);
        	log.flush();
        	System.err.println("\nSimple Interest in decimal "+ simpleInterest);
        	break;
    	case 2:
    		CompoundInterest compound_interest1 = new CompoundInterest();
    		compound_interest1.setValues(principle, rate, time);
    		double compoundInterest= compound_interest1.findCompoundInterest();
    		log.write("Compound Interest int integer "+(int)compoundInterest);
    		log.flush();
        	System.err.println("\nCompound Interest in decimal "+ compoundInterest);
    		break;
    	default:
    		log.write("\nInvalid Input");
            log.flush();
    	}
    	log.write("\nProgram Exiting");
        log.flush();

	}

}
