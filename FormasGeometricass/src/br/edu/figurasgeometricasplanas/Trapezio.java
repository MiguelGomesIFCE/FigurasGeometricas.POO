package br.edu.figurasgeometricasplanas;

public class Trapezio {
	private double basemaior;
	private double basemenor;
	private double altura;
	private double area;
	
	public Trapezio() {
		basemaior = 0;
		basemenor = 0;
		altura = 0;
		area = 0;
	}
	
	public void recebeMaior(double pBaseMaior) {
		basemaior = pBaseMaior;
	}
	public void recebeMenor(double pBaseMenor) {
		basemenor = pBaseMenor;
	}
	public void recebeAltura(double pAltura) {
		altura = pAltura;
	}
	public void calcArea() {
		area = (basemaior+basemenor)*altura/2;
	}
	public void mostrarArea() {
		System.out.println(area);
	}
	public double retornarArea() {
		System.out.println(area);
		return area;
	}
}