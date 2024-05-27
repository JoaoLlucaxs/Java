package forLaco;

public class TesteFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// imprimir até o 10
		
		for(int contador=0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		
		// aqui se chamar não funciona devido seu escopo
		//System.out.println(contador);
	}

}
