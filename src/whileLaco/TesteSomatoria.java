package whileLaco;

public class TesteSomatoria {
	public static void main(String[] args) {
		// Somat�ria parciais
		
		
		int contador=0;
		int total=0; // total ser� a somatoria, que a cada la�o soma o contador + ele mesmo
		
		while(contador <= 10) {
			//int total=0; - > se cria aqui cada vez que for verificar ela volta a ser 0 (famoso escopo)
			total+=contador;
			contador++;
			
			System.out.println(total);
		}
		
	}
}
