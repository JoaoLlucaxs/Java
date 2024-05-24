package condicional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Notas {

	public static void main(String[] args) throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(Locale.US);
		
		double nota1=lerNota(reader, "Digite a primeira nota");
		double nota2=lerNota(reader, "Digite a segunda nota");
		
		String resultado=aprovacao(nota1, nota2);
		
		System.out.println(resultado);
		
	}

	public static double lerNota(BufferedReader reader, String mensagem) throws NumberFormatException, IOException {
		System.out.println(mensagem);
		return Double.parseDouble(reader.readLine());
	}
	
	public static String aprovacao(double nota1,double nota2) {
		double calculandoNotas=nota1 + nota2;
		String resultado=(calculandoNotas >= 60.0)? "APROVADO!" : "REPROVADO!";
		return resultado;
	}
}
