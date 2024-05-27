package manipulaStrings;

public class FuncoesParaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * • Formatar: toLowerCase(), toUpperCase(), trim() ;
		 * • Recortar: substring(inicio), substring(inicio, fim) ;
		 * • Substituir: Replace(char, char), Replace(string, string) ;
		 * • Buscar: IndexOf, LastIndexOf 
		 * */
		
		String original = "Ola sistema java, bem vindo  ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		System.out.println();
		//****************** OPEÇÕES COM SPLIT()***********************************
		String frutas="morango maça pera"; 
		
		// Suponha que eu quero colocar cada uma em um vetor
		String[] vect=frutas.split(" "); // pega a partir do espaço entre elas
		String fruta1=vect[0];
		String fruta2=vect[1];
		String fruta3=vect[2];
		
		System.out.println(convertPrimeiraLetraMaiuscula(fruta1));
		System.out.println(fruta2.toUpperCase());
		System.out.println(fruta3.toUpperCase());
	}
	
	private static String convertPrimeiraLetraMaiuscula(String letra) {
		if(letra == null || letra.isEmpty()) {
			return letra;
		}
		return letra.substring(0, 1).toUpperCase() + letra.substring(1).toLowerCase();
	}

}
