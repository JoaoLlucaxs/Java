package Wrapper;

public class Boxing_Unboxing {

	public static void main(String[] args) {

		/* Tomar cuidado para n�o usar demais.. perde desempenho

		ESSE TEMA É BOM SABER
		PORÉM SABER QUE NÃO SE DEVE USAR MUITO
		POIS A VARIAVEL ACABA PERDENDO MUITO DESEMPENHO
		ALÉM DE TORNAR LENTA A COLETA NO GARBAGE

		 */
		
		
		/* PARA UTILIZAR UMA VARIAVEL BOXING NÃO HÁ NECESSIDADE DE INSTANCIAR OBJETO
		Integer x= new Integer(10);

		*/
		Integer x=10; // DESSA FORMA O JAVA JÁ ENTENDE QUE É UM BOXING (OBJETO DO TIPO INTEGER)
		
		int i= x; // UNBOXING
		
		// =========================================================================
		Integer i1=127;
		Integer i2 =127;
		
		Integer i3=128;
		Integer i4=128;

		// A SEGUIR VAMOS ENTENDER ALGUMAS COISAS A MAIS:
		System.out.println(i1 == i2); // true
		System.out.println(i3 == i4); // false
		
		/*
		* PORQUE UM DA TRUE E OUTRO FALSE ?
		*
		* = Ambos i1 e i2 recebem o valor 127,
		* que está dentro do intervalo de cache.
		* Como resultado, o Java reutiliza o mesmo objeto Integer para ambos, e,
		* portanto, a comparação com == retorna true porque i1 e i2 apontam para a mesma instância de Integer.
		*
		* JÁ (I3 E I4) -> JÁ É 128 , ENTÃO ELE CRIA A INSTANCIA DE CADA OBJETO E ISSO TORNAM OBJETOS DIFERENTES
		*
		* */
	}

}
