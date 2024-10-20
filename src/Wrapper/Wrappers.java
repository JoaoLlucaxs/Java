package Wrapper;

public class Wrappers {

	public static void main(String[] args) {
		// Wrapper - SIGNIFICA ENVELOPAR
		
		/* VAI MUITO DO QUE PRETENDEMOS FAZER COM A VARIAVEL ..
		EX : APENAS UTILIZAR UMA VARIAVEL EM ESPECIFICO UTILIZE TIPO PRIMITIVO

		QUER MANIPULAR ESSA VARIAVEL, TRANSFORMAR, VER FUNÇÕES DESSA VARIAVEL UTILIZE WRAPPER
		QUE É O PRIMITIVO SE TORNANDO OBJETO
		*/
		int y=10; // APENAS ALOCANDO
		Integer x= new Integer(10); // AQUI PODEMOS ALOCAR E MANIPULAR

		// UM A MAIS NA EXPLICAÇÃO
		byte i= x.byteValue(); // pegando o valor em byte e entregando para a variavel
	}

	/*
	*Situações Comuns Onde Wrappers são Úteis:
	1 - Coleções genéricas como List, Set, Map que aceitam apenas objetos.
	2 - APIs que esperam objetos ao invés de tipos primitivos (ex.: ao trabalhar com frameworks ou bibliotecas externas).
	3 - Interoperabilidade com reflexão, onde objetos são necessários para manipulação dinâmica.
	*
	* */
}
