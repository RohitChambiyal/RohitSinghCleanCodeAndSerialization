package com.rohit.interest;



public class SimpleInterest extends ParentInterest{
	
	public double findSimpleInterest() {
		return  (super.getPrinciple() *super.getRate() * super.getTime())/100;
		
	}
}
