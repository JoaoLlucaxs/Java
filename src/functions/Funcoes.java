package functions;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Representam um processamento que possui um significado
		• Math.sqrt(double)
		 • System.out.println(string) 
		 • Principais vantagens: modularização, delegação e reaproveitamento
		• Dados de entrada e saída
		• Funções podem receber dados de entrada (parâmetros ou argumentos) • Funções podem ou não retornar uma saída
		• Em orientação a objetos, funções em classes recebem o nome de
		 * */
		
		
		// Fazer um programa e ler na tela o maior deles
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Informe valor do primeiro : ");
		a=sc.nextInt();
		
		System.out.println("Informe valor do segundo : ");
		b=sc.nextInt();
		
		System.out.println("Informe valor do terceiro : ");
		c=sc.nextInt();
		
		int pegaValorMaior=verificaMaiorNumero(a, b, c);
		
		System.out.println("Valor maior é " + pegaValorMaior);
		
		sc.close();
	}
	
	public static int verificaMaiorNumero(int a, int b , int c) {
		int retornaMaior;
		if(a > b && a > c) {
			return retornaMaior=a;
		}else if(b > c) {
			return retornaMaior=b;
		}else {
			return retornaMaior =c;
		}
	}
}
