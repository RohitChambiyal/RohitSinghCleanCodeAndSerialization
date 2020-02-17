package com.rohit.interest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class HouseConstructionMainClass {
	public int findHouseConstructionCost() throws IOException {
			Scanner input = new Scanner(System.in);
        int material_standard;
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        log.write("MATERIAL SELECTION\n");
        log.flush();
        log.write("Enter 1 for standard \n Enter 2 for above standard \n Enter 3 for high standard material ");
        log.flush();
        int material_number = input.nextInt();
        switch(material_number) {
        case 1:
        	material_standard= 1200;
        	break;
        case 2:
        	material_standard = 1500;
        	break;
        case 3:
        	log.write("Enter y for fully automated home, n for non-fully automated home");
        	log.flush();
        	input.nextLine();
        	String response = input.nextLine();
        	if(response.equalsIgnoreCase("y"))
        		material_standard = 2500;
        	else
        		material_standard = 1800;
        	break;
        default:
        	log.write("Invalid value selected for material");
        	log.flush();
        	return 0;
        	
        }
        log.write("Enter total area of house");
    	log.flush();
        double total_area = input.nextInt();
        double total_square_feet = (double)(total_area * 10.764);
        
         double  house_construction_cost =(double)( (double)total_square_feet * (double)material_standard)/1000;
        log.write("Estimated House Construction Cost in thousand Rupees : "+house_construction_cost);
        log.flush();
        log.write("\nProgram Exiting");
        log.flush();
        return 1;
        
        
    
	}
}
