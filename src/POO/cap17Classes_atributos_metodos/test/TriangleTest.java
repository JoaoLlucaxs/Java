package POO.cap17Classes_atributos_métodos.test;

import java.util.Locale;
import java.util.Scanner;

import POO.cap17Classes_atributos_métodos.entities.Triangle;

public class TriangleTest {

	public static void main(String[] args) {
		// Utilizando o básico de POO, note que na entidade ainda estão "public"
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Triangle x=new Triangle();
		Triangle y=new Triangle();
		
		System.out.println("Entre com os dados do triangulo X: ");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
		
		System.out.println("Entre com os dados do triangulo Y: ");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
		double resultX=x.area();
		double resultY=y.area();
		
		System.out.println("TRIANGULO A : " + resultX);
	
		System.out.println("TRIANGULO A : " + resultY);
		
		if(resultX > resultY) {
			System.out.println("Largura maior X");
		}else {
			System.out.println("Largura maior Y");
		}
		
		sc.close();
	}

}
