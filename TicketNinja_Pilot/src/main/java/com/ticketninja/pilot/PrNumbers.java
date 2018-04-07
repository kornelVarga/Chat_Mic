package com.ticketninja.pilot;

public class PrNumbers {
	private int firstNumber;
	private int secondNumber;

	public PrNumbers(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int addition() {
		return (firstNumber + secondNumber);
	}

	// Creating the result string that the Chatfuel can handl
	
}