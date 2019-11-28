package com.ustglobal.lambdaexpressions;

public class TestGreet {
	public static void main(String[] args) {
		
		
		
		GreetInterface greet = (message) -> {
			System.out.println("Hello");
			System.out.println(message);
		};
	}

}
