package estruturaSequencial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Troco {

	// Desafio estrutura sequencial para troco
	// Estrutura Sequencial - > tipo de controle de fluxo onde as instruções são executadas uma após a outra, em ordem linear
	public static void main(String[] args) {
				BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
				
				//Confifura para ler números com ponto decimal
				Locale.setDefault(Locale.US);
				
				try {
					System.out.println("Preço unitario do produto: ");
					double precoProduto=Double.parseDouble(reader.readLine());
					
					System.out.println("Quantidade comprada : ");
					int qtd=Integer.parseInt(reader.readLine());
					
					System.out.println("Dinheiro recebido : ");
					double valorRecebido=Double.parseDouble(reader.readLine());
					
					double valorDaCompra=valorTotalDaCompra(qtd, precoProduto);
					
					while(valorRecebido < valorDaCompra) {
						double diferenca=valorDaCompra - valorRecebido;
						System.out.println("Valor insuficiente faltam " + diferenca);
						
						System.out.println("Favor adicionar o restante ");
						
						// eu vou incrementando o que falta caso insira novamente o valor abaixo do valor da compra
						double valorAdicional=Double.parseDouble(reader.readLine());
						valorRecebido+=valorAdicional;
					}
				
					System.out.println("======== AGUARDE VERIFICANDO SE HÁ TROCO===============");
					double totalDaCompra=calculaCaixa(precoProduto, qtd, valorRecebido);
				
					System.out.println("TROCO = " + totalDaCompra);
				
					reader.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			
	
			/*Porque optei por método estatico ? -> Eles apenas trabalham com os parâmetros fornecidos e retornam um resultado
			 * não acessam ou modificam nenhum campo de instância da classe*/
	
			public static double valorTotalDaCompra(double qtd, double valorDoProduto) {
				double totalDaCompra= qtd * valorDoProduto;
				return totalDaCompra;
			}
			
	
			public static double calculaCaixa(double preco, int qtd, double valorPago) {
				double totalCompra=qtd * preco;
				double trocoCliente=0.0;
				
				trocoCliente=totalCompra - valorPago;
				return convertPositivo(trocoCliente);
			}
			
			public static double convertPositivo(double trocoPositivo) {
				if(trocoPositivo < 0) {
					trocoPositivo *= -1; // convertendo para positivo
				}
				return trocoPositivo;
			}

}
