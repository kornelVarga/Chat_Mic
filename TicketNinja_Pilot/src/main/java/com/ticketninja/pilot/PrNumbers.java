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
	public String toChatFuel() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\r\n");
		builder.append(" \"messages\": [\r\n");
		builder.append("   {\"text\": \"Your information:\"},\r\n");
		builder.append("   {\"text\": \"The numbers: ");
		builder.append(firstNumber);
		builder.append(" and ");
		builder.append(secondNumber);
		builder.append("\"},\r\n");
		builder.append("   {\"text\": \"The addition's result: ");
		builder.append(addition());
		builder.append("\"}\r\n");
		builder.append(" ]\r\n");
		builder.append("}");
		return builder.toString();
	}
}