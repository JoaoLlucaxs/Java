package whileLaco;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {
	public static void main(String[] args) {
		
		/*Crie um programa que simula um jogo de adivinha��o de n�mero. 
		 * O computador deve escolher um n�mero aleat�rio entre 1 e 100, 
		 * e o usu�rio deve tentar adivinhar qual � esse n�mero. 
		 * O programa deve dar dicas ao usu�rio dizendo se o palpite � muito alto ou muito baixo 
		 * at� que o usu�rio adivinhe corretamente.

		Requisitos:

		O programa deve gerar um n�mero aleat�rio entre 1 e 100. 
		O usu�rio deve ser capaz de inserir palpites at� que adivinhe o n�mero corretamente.
		Para cada palpite, o programa deve informar se o palpite � muito alto, muito baixo ou correto.
		Quando o usu�rio acertar o n�mero, o programa deve exibir o n�mero de tentativas feitas.*/
		
		
		Scanner sc=new Scanner(System.in);
		
		Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um n�mero entre 1 e 100
        System.out.println(numeroAleatorio);
        
        int totalDeChances=5;
        
  
        System.out.println("Informe seu palpite : ");
        Integer palpite=Integer.parseInt(sc.next());
        
        while(palpite != numeroAleatorio && totalDeChances > 0) {
        		totalDeChances--;
        		
        		if(palpite > numeroAleatorio) {
        			System.out.println("MUITO ALTO!!");
        		}else {
        			System.out.println("MUITO BAIXO!!");
        		}
        		
        		System.out.println("Errado! , suas chances � de " + totalDeChances);
        		palpite=Integer.parseInt(sc.next());
        	
        }
		
        System.out.println("Parab�ns o palpite = " + palpite + " � o valor correto = " + numeroAleatorio);
        
		sc.close();
	}
}
