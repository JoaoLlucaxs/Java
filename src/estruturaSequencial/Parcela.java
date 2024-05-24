package estruturaSequencial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Parcela {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		//Confifura para ler números com ponto decimal
		Locale.setDefault(Locale.US);
		
		Calendar data = Calendar.getInstance();
		
		Double valorDoImovel=2000.00;
		
		System.out.println("Informe seu nome ");
		String nomeComprador=reader.readLine();
		
		System.out.println("Muito bem senhhor(a), está de acordo com o valor? S/N");
		  String resposta = reader.readLine(); // Lê a linha de entrada
          char respostaComprador = resposta.charAt(0); // Pega o primeiro caractere da linha
          
        while(respostaComprador != 'S' && respostaComprador != 'N') {
        	System.out.println("Senhor(a) , por favor insira corretamente os dados para que eu possa detectar");
        	resposta = reader.readLine();
        	respostaComprador = resposta.charAt(0);
        }
        
        if(respostaComprador == 'S') {
        	System.out.println("Muito bem ! a data da compra contará como hoje " +new SimpleDateFormat("dd/MM/yyyy")
		            .format(data.getTime()));
        	
        	System.out.println("Informe para mim a quantidade de parcelas que deseja pagar? ");
        	int parcelas=Integer.parseInt(reader.readLine());
        	parcelarVendaImovel(parcelas, data);
        	
        }else {
        	System.out.println("Lamentamos! , não podemos dar continuidade com a sua compra do imovél desejado.");
        }
	}
	
	public static void parcelarVendaImovel(double qtdParcela, Calendar data) {
		for(int parcela=1; parcela <= qtdParcela; parcela++) {
			data.add(Calendar.MONTH, 1);
			 System.out.println("Parcela de numero " + parcela + " vencimento é em " + new SimpleDateFormat("dd/MM/yyyy")
			            .format(data.getTime()));
		}
	}

}
