package whileLaco;

public class TesteWhile {
	public static void main(String[] args) {
		
		//while -> tamb�m devolve true ou false
		
		
		// Abaixo h� um c�digo onde ele verifica se o contador � menor ou igual a 10
		// Se sim, ele entra e incrementa , quando a verifica��o for false ela sai do la�o
		int contador=0;
		
		while(contador <= 10) {
			System.out.println(contador++);
		}
		
		// Isso � muito utilizado quando voc� quer ler por exemplo um arquivo: Enquanto tiver dados leia
	}
}
