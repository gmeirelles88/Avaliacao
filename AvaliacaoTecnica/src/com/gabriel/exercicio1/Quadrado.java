package com.gabriel.exercicio1;

public class Quadrado implements AreaCalculavel {
	
	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularAreaDaForma() {
		return lado * lado;
	}
	
	

}
