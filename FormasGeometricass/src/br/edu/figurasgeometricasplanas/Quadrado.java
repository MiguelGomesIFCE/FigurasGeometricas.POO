package br.edu.figurasgeometricasplanas;

public class Quadrado {
	
	private double lado;
	private double area;
	
	public Quadrado() {
		lado = 0;
		area = 0;
	}
	
	public void recebeLado(double pLado) {
		lado = pLado;
	}
	public void calcArea() {
		area = (lado * lado);
	}
	public void mostrarArea() {
		System.out.println(area);
	}
	public double retornarArea() {
		System.out.println(area);
		return area;
	}
}