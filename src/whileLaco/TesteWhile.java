package whileLaco;

public class TesteWhile {
	public static void main(String[] args) {
		
		/* WHILE (ENQUANTO ALGO FOR ... FAÇA )) -> É UM BOOLEAN , ELA DEVOLVE SE A SUA PERGUNTA SAIRÁ COMO VERDADEIRA OU FALSA
		E A PARTIR DISSO TU OPTA EM FAZER ALGO COM BASE NA RESPOSTA

		************** VAMOS AO EXEMPLO ******************
		*/
		

		int contador=0; // EU TENHO UMA VARIAVEL QUE INICIA EM 0
		
		while(contador <= 10) { // AQUI ELA VAI PASSAR 10 VEZES NA MESMA PERGUNTA (É MENOR QUE 10? SIM ? ENTÃO ENTRA DENTRO DO CORPO E FAZ ALGO)
			System.out.println(contador++); // ENTROU AQUI , ++ INCREMENTA ENTÃO 0 + 1 = 1.. E ASSIM VOLTA A PERGUNTA
		}
		
		// EXEMPLO 1 - MUITO UTILIZADO QUANDO O PROGRAMA PRECISA LER ARQUIVOS: TEM DADOS? LEIA , CHEGOU NO FINAL DO ARQUIVO (AINDA TEM DADOS? NÃO , ENTÃO SAIA)
	}
}
