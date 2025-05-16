package br.edu.figurasgeometricasplanas;

public class Losango {
	private double diagmaior;
	private double diagmenor;
	private double area;
	
	public Losango() {
		diagmaior = 0;
		diagmenor = 0;
		area = 0;
	}
	
	public void recebeMaior(double pDiagMaior) {
		diagmaior = pDiagMaior;
	}
	public void recebeMenor(double pDiagMenor) {
		diagmenor = pDiagMenor;
	}
	public void calcArea() {
		area = (diagmaior*diagmenor)/2;
	}
	public void mostrarArea() {
		System.out.println(area);
	}
	public double retornarArea() {
		System.out.println(area);
		return area;
	}
}