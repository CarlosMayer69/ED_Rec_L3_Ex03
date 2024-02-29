package view;

import controller.InverteStringRecController;

public class Principal {

	public static void main(String[] args) {
		
		InverteStringRecController is = new InverteStringRecController();
		
		//String s = "teste";
		String s = "FATECZL";
		String inverterString = is.inverterString(s);
		
		System.out.println(inverterString);

	}

}