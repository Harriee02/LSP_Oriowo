package org.howard.edu.lsp.assignment2;
import java.util.Scanner;

public class SumAndProduct {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("String?");
		String value = scanner.nextLine();
		
		while (!(value.equals("Goodbye"))) {
			int product = 1;
	        int summ = 0;
	        String[] arrOfStr = value.split(" ", 0);
	        System.out.println("Tokens:");
	        for (String a : arrOfStr) {
	        	System.out.println(a);
	        	product *= Integer.valueOf(a);
	        	summ += Integer.valueOf(a);}
	        System.out.println("Sum:"+summ);
	        System.out.println("Product:"+product);
	        System.out.println("String?:");
			value = scanner.nextLine();
		}

	
		}
	}

