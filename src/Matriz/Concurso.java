package Matriz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Concurso {

	public static void main(String[] args) throws Exception{
	
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		//Confifura para ler números com ponto decimal
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantas pessoas participaram do concurso? ");
		int totalPessoas= Integer.parseInt(reader.readLine());
		
		/*
		 * totalPessoas é o número de linhas (representando o número total de pessoas).
		3 é o número de colunas (cada pessoa terá três atributos armazenados, 
		que podem ser, por exemplo, nome, idade e cidade).
		
		(totalPessoas) -> é usada para definir o número de linhas da matriz de String. 
		Isso não significa que estou armazenando um int dentro de uma matriz de String, 
		mas sim que está utilizando esse int para determinar o tamanho da matriz.
		 * */
		 String[][] pessoas = new String[totalPessoas][3]; 
		for (int i = 0; i < totalPessoas; i++) {
			System.out.println("Informe o nome da pessoa " + (i + 1));
			pessoas[i][0]=reader.readLine();
			
			System.out.println("Nota da etapa 1 da pessoa " + (i + 1));
			pessoas[i][1]=reader.readLine();
			
			System.out.println("Nota da etapa 2 da pessoa " + (i + 1));
			pessoas[i][2]=reader.readLine();
		}
		
		 // Verificar se a média das notas de cada pessoa é maior que 70
        for (int i = 0; i < totalPessoas; i++) {
            String nome = pessoas[i][0];
            double nota1 = Double.parseDouble(pessoas[i][1]);
            double nota2 = Double.parseDouble(pessoas[i][2]);
            
            double media = mediaTotal(nota1, nota2);
            
            if (media > 70) {
                System.out.println(nome + " teve média maior que 70 - APROVADO.");
            } else {
                System.out.println(nome + " teve média menor QUE 70 - REPROVADO.");
            }
        }
        
        // Exibindo os dados armazenados
        System.out.println("\nDados das pessoas:");
        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Nome: " + pessoas[i][0]);
            System.out.println("Nota 1: " + pessoas[i][1]);
            System.out.println("Nota 2: " + pessoas[i][2]);
            System.out.println(); // Adiciona uma linha em branco entre cada pessoa
        }
        
        // =============================== EXEMPLO DE COMO FICARÁ =========================
        
        /*
         * Quantas pessoas participaram do concurso? = 3
		
		Informe o nome da pessoa 1 = Joao

		Nota da etapa 1 da pessoa 1= 70.0
	
		Nota da etapa 2 da pessoa 1= 67.0

		Informe o nome da pessoa 2= Lucas

		Nota da etapa 1 da pessoa 2= 67.0

		Nota da etapa 2 da pessoa 2= 89.0

		Informe o nome da pessoa 3 = Heigh

		Nota da etapa 1 da pessoa 3= 65.0

		Nota da etapa 2 da pessoa 3= 55.0

	Joao teve média menor QUE 70 - REPROVADO.
	Lucas teve média maior que 70 - APROVADO.
	Heigh teve média menor QUE 70 - REPROVADO.

	Dados das pessoas:
	Nome: Joao
	Nota 1: 70.0
	Nota 2: 67.0

	Nome: Lucas
	Nota 1: 67.0
	Nota 2: 89.0

	Nome: Heigh
	Nota 1: 65.0
	Nota 2: 55.0
         */
        
      reader.close();
	}
	
	//Ao declarar um método como static, está indicando que ele pertence à classe em si 
	//e pode ser acessado diretamente na classe, sem a necessidade de criar uma instância da classe.
	public static double mediaTotal(double nota1,double nota2) {
		return (nota1 + nota2) / 2;
	}
	
}
