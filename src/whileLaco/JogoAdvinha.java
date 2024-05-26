package whileLaco;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {
	public static void main(String[] args) {
		
		/*Crie um programa que simula um jogo de adivinhação de número. 
		 * O computador deve escolher um número aleatório entre 1 e 100, 
		 * e o usuário deve tentar adivinhar qual é esse número. 
		 * O programa deve dar dicas ao usuário dizendo se o palpite é muito alto ou muito baixo 
		 * até que o usuário adivinhe corretamente.

		Requisitos:

		O programa deve gerar um número aleatório entre 1 e 100. 
		O usuário deve ser capaz de inserir palpites até que adivinhe o número corretamente.
		Para cada palpite, o programa deve informar se o palpite é muito alto, muito baixo ou correto.
		Quando o usuário acertar o número, o programa deve exibir o número de tentativas feitas.*/
		
		
		Scanner sc=new Scanner(System.in);
		
		Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número entre 1 e 100
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
        		
        		System.out.println("Errado! , suas chances é de " + totalDeChances);
        		palpite=Integer.parseInt(sc.next());
        	
        }
		
        System.out.println("Parabéns o palpite = " + palpite + " é o valor correto = " + numeroAleatorio);
        
		sc.close();
	}
}
