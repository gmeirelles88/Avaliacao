package com.gabriel.exercicio1;

public class Circulo implements AreaCalculavel {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularAreaDaForma() {
		return (raio * raio) * Math.PI;
	}


	
	
}
