package com.rohit.interest;



public class CompoundInterest extends ParentInterest {
	
	public double findCompoundInterest() {
		return super.getPrinciple()* (Math.pow((1 + super.getRate() / 100), super.getTime())); 
		
	}
}
