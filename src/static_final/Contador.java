package static_final;

public class Contador {
	
	public static int COUNT = 0;// não é do objeto e sim da classe então não precisa instanciar o objeto para chamr esse
	public static final double PI = 3.14; // final ele faz com que o atributo não seja MODIFICADO
	
	public void incrementar() {
		COUNT++;
	}
	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora �: " + Contador.COUNT);
	}

	// ================================= EXPLICAÇÕES =================================

	/*static significa que o membro (atributo ou método) pertence à classe,
	 e não a uma instância específica da classe.
	 Isso é útil quando você quer criar algo que possa ser acessado sem precisar criar um objeto da classe.
	 Um exemplo típico de uso de static no ambiente de trabalho é em classes utilitárias,
	  como a classe Math do Java.*/

}
