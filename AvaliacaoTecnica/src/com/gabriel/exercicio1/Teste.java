package com.gabriel.exercicio1;

public class Teste {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(2);
		System.out.println(" A área do Quadrado é de : " + quadrado.calcularAreaDaForma());
		
		Retangulo retangulo = new Retangulo(10, 20);
		System.out.println(" A área do Retangulo é de : " + retangulo.calcularAreaDaForma());
		
		Circulo circulo = new Circulo(2.2);
		System.out.println(" A área do Círculo é de : " + circulo.calcularAreaDaForma());
	

	}

}
