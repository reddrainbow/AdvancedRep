package main;

import main.utils.Calculator;

public class MainClass {

	public static void main(String[] args) {
		MainClass mC = new MainClass(); 
		mC.pM("P1[1.2345]; P2[2.3456]::: P1*P2 = "+Calculator.MultiplyDoubles(1.2345, 2.3456));

	}
	
	public void pM(String pMessage){
		System.out.println(pMessage);
	}

}
