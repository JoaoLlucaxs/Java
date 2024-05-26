package whileLaco;

public class TesteWhile {
	public static void main(String[] args) {
		
		//while -> também devolve true ou false
		
		
		// Abaixo há um código onde ele verifica se o contador é menor ou igual a 10
		// Se sim, ele entra e incrementa , quando a verificação for false ela sai do laço
		int contador=0;
		
		while(contador <= 10) {
			System.out.println(contador++);
		}
		
		// Isso é muito utilizado quando você quer ler por exemplo um arquivo: Enquanto tiver dados leia
	}
}
