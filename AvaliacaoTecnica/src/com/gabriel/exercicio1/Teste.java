package com.gabriel.exercicio1;

public class Teste {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(2);
		System.out.println(" A �rea do Quadrado � de : " + quadrado.calcularAreaDaForma());
		
		Retangulo retangulo = new Retangulo(10, 20);
		System.out.println(" A �rea do Retangulo � de : " + retangulo.calcularAreaDaForma());
		
		Circulo circulo = new Circulo(2.2);
		System.out.println(" A �rea do C�rculo � de : " + circulo.calcularAreaDaForma());
	

	}

}
