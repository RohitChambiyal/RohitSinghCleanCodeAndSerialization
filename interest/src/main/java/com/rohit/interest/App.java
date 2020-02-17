package com.rohit.interest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	Scanner input = new Scanner(System.in);
    	BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        log.write("Enter interest to calculate Interest or Enter HouseCost for house cost estimation");
        log.flush();
    	String start_selection = input.nextLine();
    	if(start_selection.equalsIgnoreCase("interest")){
    		InterestMainClass Interest_main_class_obj =new InterestMainClass();
        	Interest_main_class_obj.RunInterestCalculator();	
    	}
    	else if(start_selection.equalsIgnoreCase("housecost")){
    		HouseConstructionMainClass constructionObject = new HouseConstructionMainClass();
    		constructionObject.findHouseConstructionCost();
    	}
    	else {
    		log.write("Invalid Input");
    		log.flush();
    	}
    	
    }
}

