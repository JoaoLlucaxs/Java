package estruturaSequencial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Idade {
	public static void main(String[] args) throws Exception {
		//Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os 
				//nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		//Confifura para ler números com ponto decimal
		Locale.setDefault(Locale.US);
		
		int nPessoas=2;
		String[] nomes=new String[nPessoas];
		Integer[] idades=new Integer[nPessoas];
		
		double mediaIdade=0.0;
		
		for(int i=0; i < nPessoas; i++) {
			JOptionPane.showMessageDialog(null, "Dados da " + (i + 1) + " pessoa", "Estrutura Sequencial/ VETOR", JOptionPane.INFORMATION_MESSAGE);
			nomes[i]=JOptionPane.showInputDialog("Nome: ");
			
			// (String idadeStr porque ? - > porque input do JOPtionPane recebe uma String então ao capturar eu converto em um inteiro)
			String idadeStr=JOptionPane.showInputDialog("Idade :");
			idades[i]=Integer.parseInt(idadeStr);
			
		}
		
		mediaIdade=somaMediaIdade(idades[0], idades[1]);
		
        JOptionPane.showMessageDialog(null, "A idade média de : " + nomes[0] + " e " + nomes[1] + 
            		"\n é de = " + mediaIdade + " anos", null, JOptionPane.INFORMATION_MESSAGE);
            
           
        reader.close();
	}
	
	// A média das idades
	public static double somaMediaIdade(int idade1,int idade2) {
		double media=(idade1 + idade2) / 2.0;
		return media;
	}
}
