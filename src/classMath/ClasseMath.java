package classMath;

public class ClasseMath {

	public static void main(String[] args) {
		// Comprimento de uma circunferência 2 x r x PI (3,1415)
		
		int raio=4;
		double comprimento= 2 * raio * Math.PI; // A classe math tem o PI 
		System.out.println("RESULTADO " + comprimento);
		
		// Maximo e Minimo
		double[] precosProdutoA= {30.20,25.49};
		double maiorPreco=Math.max(precosProdutoA[0], precosProdutoA[1]);
		double menorPreco=Math.min(precosProdutoA[0], precosProdutoA[1]);
		
		System.out.println("MAIOR : " + maiorPreco);
		System.out.println("MENOR: " + menorPreco);
		
		// Potência
		System.out.println("CALCULO DE POTENCIA " + Math.pow(2, 3));
		
		// Arredondamento ceil, floor e round
		double n=5.14;
		System.out.println("MENOR INTEIRO " + Math.floor(n));
		System.out.println("MAIOR INTEIRO " + Math.ceil(n));
		
		
		// TRIGONOMETRIA
		System.out.println("Seno : " + Math.sin(40));
		
		// NUMEROS RANDOMICOS
		double numeroAleatorio=Math.random();
		System.out.println(numeroAleatorio);
	}

}
