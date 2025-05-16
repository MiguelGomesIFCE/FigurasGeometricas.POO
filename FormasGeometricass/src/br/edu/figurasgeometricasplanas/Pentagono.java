package br.edu.figurasgeometricasplanas;

public class Pentagono {
	
	private double perimetro;
	private double apotema;
	private double area;
	
	public Pentagono() {
		perimetro = 0;
		apotema = 0;
		area = 0;
	}
	
	public void recebePerimetro(double pPerimetro) {
		perimetro = pPerimetro;
	}
	public void recebeApotema(double pApotema) {
		apotema = pApotema;
	}
	public void calcArea() {
		area = (perimetro*apotema)/2;
	}
	public void mostrarArea() {
		System.out.println(area);
	}
	public double retornarArea() {
		System.out.println(area);
		return area;
	}
}