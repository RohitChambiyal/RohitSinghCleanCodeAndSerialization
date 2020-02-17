package com.rohit.interest;

public class ParentInterest {
	private int principle;
	private int rate;
	private int time;
	public void setValues(int principle,int rate, int time) {
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}
	public int getPrinciple() {
		return this.principle;
	}
	public int getRate() {
		return this.rate;
	}
	public int getTime() {
		return this.time;
	}
}
