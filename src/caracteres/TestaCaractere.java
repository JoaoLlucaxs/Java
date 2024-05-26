package caracteres;

public class TestaCaractere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Char -> guarda uma única letra usando ''
		
		// IMPORTANTE saber que char guarda numero (tabela unicode), que quando compilada vira um caractere
		char valor=66;
		System.out.println(valor); // sairá B , pois na tabela 66 é B
		
		// Char é interessante, mas não é o que usamos no dia a dia e sim String
		
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
		System.out.println(segundo); // 5 -> não é poo que faz referência, e sim apenas um copia e cola
	}

}
