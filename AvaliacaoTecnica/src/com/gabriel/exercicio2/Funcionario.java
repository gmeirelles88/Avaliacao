package com.gabriel.exercicio2;

public class Funcionario extends Pessoa {

	double salario_inicial;
	double percentual;
	double salario_total;
	
	public double getSalario_inicial() {
		return salario_inicial;
	}
	public void setSalario_inicial(double salario_inicial) {
		this.salario_inicial = salario_inicial;
	}
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	public double getSalario_total() {
		return salario_total;
	}

	
	public double obterValorSalario(int ano_inicial) {
		
		double salario = getSalario_inicial();
		double aumento = getPercentual();
		ano_inicial = 2016;

	        
	        do{
        salario = salario + (salario * aumento / 100); 
        aumento = aumento * 2; 
        ano_inicial++; 
     }while(ano_inicial <= 2020); 
	        return salario;

	    }
	}
	
	

