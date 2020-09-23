package com.gabriel.exercicio2;

public class Principal {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		
		func.setSalario_inicial(1000); 
		func.setPercentual(1.5);
		func.obterValorSalario(2016);
	
		System.out.println(" O Salario atual é de R$: " + func.obterValorSalario(2016));
		
			
		
   }

	}


