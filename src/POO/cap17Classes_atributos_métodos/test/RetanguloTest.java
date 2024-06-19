package POO.cap17Classes_atributos_métodos.test;

import java.util.Locale;
import java.util.Scanner;

import POO.cap17Classes_atributos_métodos.entities.Retangulo;

public class RetanguloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entre com a largura e a altura do retangulo: ");
		Retangulo retangulo=new Retangulo();
		
		retangulo.largura=sc.nextDouble();
		retangulo.altura=sc.nextDouble();
		
		double A= retangulo.calcArea();
		double P = retangulo.calcPerimetro();
		double D =retangulo.calcDiagonal();
		
		System.out.println("AREA = " + A);
		System.out.println("PERIMETRO = " + P);
		System.out.println("DIAGONAL = " + D);
		
		sc.close();
	}

}
