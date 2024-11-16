package static_final;

public class TesteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contador contador=new Contador();
		
		// Chamando o m�todo que incrementa
		contador.incrementar();

		// Só é possível chamar o método direto sem precisar de instância devido o static
		Contador.imprimirContador();
	}

}
