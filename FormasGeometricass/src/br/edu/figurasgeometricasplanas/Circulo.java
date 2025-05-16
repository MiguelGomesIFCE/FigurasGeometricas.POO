package br.edu.figurasgeometricasplanas;

public class Circulo {
	
	private double raio;
	private double area;
	
	public Circulo() {
		raio = 0;
		area = 0;
	}
	
	public void recebeRaio(double pRaio) {
		raio = pRaio;
	}
	public void calcArea() {
		area = (Math.PI*(raio*raio));
	}
	public void mostrarArea() {
		System.out.println(area);
	}
	public double retornarArea() {
		System.out.println(area);
		return area;
	}
}