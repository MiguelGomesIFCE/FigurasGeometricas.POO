package br.edu.figurasgeometricasplanas;

public class Hexagono {
	private double lado;
	private double area;
	
	public Hexagono() {
		lado = 0;
		area = 0;
	}
	
	public void recebeLado(double pLado) {
		lado = pLado;
	}

	public void calcArea() {
		
		area = (3*Math.sqrt(3)/2)*(lado*lado);
	}
	public void mostrarArea() {
		System.out.println(area);
	}
	public double retornarArea() {
		System.out.println(area);
		return area;
	}
}