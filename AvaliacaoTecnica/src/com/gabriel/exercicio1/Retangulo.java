package com.gabriel.exercicio1;

public class Retangulo implements AreaCalculavel {
	
	private int largura;
	
	private int altura;
	
	
	public Retangulo() {
		// TODO Auto-generated constructor stub
	}
	

	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}


	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double calcularAreaDaForma() {
		// TODO Auto-generated method stub
		return largura * altura;
	}

}
