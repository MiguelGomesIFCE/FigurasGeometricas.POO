package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;

public class Principal {

	public static void main(String[] args) {
		
		Triangulo fg1 = new Triangulo();
		fg1.recebeAltura(3);
		fg1.recebeBase(10);
		fg1.calcArea();
		fg1.mostrarArea();
		double recebeAreaTri = fg1.retornarArea();
		
		Quadrado fg2 = new Quadrado();
		fg2.recebeLado(10);
		fg2.calcArea();
		fg2.mostrarArea();
		double recebeAreaQua = fg2.retornarArea();
		
		Circulo fg3 = new Circulo();
		fg3.recebeRaio(10);
		fg3.calcArea();
		fg3.mostrarArea();
		double recebeAreaCir = fg3.retornarArea();
		
		Retangulo fg4 = new Retangulo();
		fg4.recebeBase(10);
		fg4.recebeAltura(5);
		fg4.calcArea();
		fg4.mostrarArea();
		double recebeAreaRet = fg4.retornarArea();
		
		Pentagono fg5 = new Pentagono();
		fg5.recebePerimetro(10);
		fg5.recebeApotema(5);
		fg5.calcArea();
		fg5.mostrarArea();
		double recebeAreaPen = fg5.retornarArea();
		
		Losango fg6 = new Losango();
		fg6.recebeMaior(10);
		fg6.recebeMenor(5);
		fg6.calcArea();
		fg6.mostrarArea();
		double recebeAreaLos = fg6.retornarArea();
		
		Trapezio fg7 = new Trapezio();
		fg7.recebeMaior(10);
		fg7.recebeMenor(5);
		fg7.recebeAltura(15);
		fg7.calcArea();
		fg7.mostrarArea();
		double recebeAreaTra = fg7.retornarArea();
		
		Hexagono fg8 = new Hexagono();
		fg8.recebeLado(10);
		fg8.calcArea();
		fg8.mostrarArea();
		double recebeAreaHex = fg8.retornarArea();
		
		Paralelogramo fg9 = new Paralelogramo();
		fg9.recebeBase(10);
		fg9.recebeAltura(15);
		fg9.calcArea();
		fg9.mostrarArea();
		double recebeAreaPar = fg9.retornarArea();
	}
}