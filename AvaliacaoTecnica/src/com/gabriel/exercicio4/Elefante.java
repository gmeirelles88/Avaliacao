package com.gabriel.exercicio4;

import java.util.Scanner;

public class Elefante {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		 System.out.println("Informe um número de 1 a 5:");
		  int num = entrada.nextInt();
		  switch (num) {
		     case 1:
		       System.out.println("Incomoda");
		       break;
		     case 2:
		       System.out.println("Incomoda Incomoda");
		       break;
		     case 3:
		       System.out.println("Incomoda Incomoda Incomoda");
		       break;
		     case 4:
		       System.out.println("Incomoda Incomoda Incomoda Incomoda");
		       break;
		     case 5:
			       System.out.println("Incomoda Incomoda Incomoda Incomoda Incomoda");
			       break;
		     default:
		       System.out.println("Por favor, digite um número válido");		    		

	}
		  System.out.println("Obrigado por brincar.");
}
}
