package caracteres;

public class TestaCaractere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Char -> guarda uma �nica letra usando ''
		
		// IMPORTANTE saber que char guarda numero (tabela unicode), que quando compilada vira um caractere
		char valor=66;
		System.out.println(valor); // sair� B , pois na tabela 66 � B
		
		// Char � interessante, mas n�o � o que usamos no dia a dia e sim String
		
		//********************************** String **********************************************
		String palavra="Entendendo conceitos da linguage java";
		System.out.println(palavra);
		
		palavra+= 2020;
		System.out.println(palavra); // toda a frase concatena com 2020
		
		//****************************************TESTANDO VALOR*****************************************************************
		
		int primeiro=5;
		int segundo=7;
		segundo=primeiro;
		primeiro=10;
		
		// QUANTO VALE O SEGUNDO ? 
		System.out.println(segundo); // 5 -> n�o � poo que faz refer�ncia, e sim apenas um copia e cola
	}

}
