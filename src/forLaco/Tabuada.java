package forLaco;

import java.util.Iterator;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Quero a tabuada de todos os numero 1 a 10
		
		for(int multiplicador=1; multiplicador <= 10 ; multiplicador++) {
			for(int contador=0; contador <= 10; contador++) {
				int total=multiplicador + contador;
				System.out.println(multiplicador + " + " + contador + " = " +  total);
			}
		}
	
		
	}

}
