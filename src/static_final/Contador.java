package static_final;

public class Contador {
	
	public static int COUNT = 0;// não é do objeto e sim da classe então não precisa instanciar o objeto para chamr esse
	public static final double PI = 3.14;
	
	public void incrementar() {
		COUNT++;
	}
	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora �: " + Contador.COUNT);
	}
}
