package com.albaycan.basicmathapp;

public class BasicMath {
	
	// creating variables
	private int x;
	private int y;
	
	// creating the Constructer with arguments
	public BasicMath(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// calculation methods
	public int add() {
		return x+y;
	}
	
	public int subtract() {
		return x-y;
	}
	
	public int multiply() {
		return x*y;
	}
	
	public float divide() {
		return (float)x/(float)y;
	}

}