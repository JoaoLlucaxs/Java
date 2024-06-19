package POO.cap17Classes_atributos_métodos.test;

import java.util.Locale;
import java.util.Scanner;

import POO.cap17Classes_atributos_métodos.entities.Produto;

public class ProdutoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Produto produto=new Produto();
		
		System.out.println("Entre com o nome do produto: ");
		produto.nome=sc.next();
		
		System.out.println("Entre com o valor do produto: ");
		produto.preco=sc.nextDouble();
		
		System.out.println("Entre com quantidade do produto: ");
		produto.qtdEstoque=sc.nextInt();
		
		System.out.println("Adicione ao estoque : ");
		int adcEstoque=sc.nextInt();
		produto.addEstoque(adcEstoque);
		
		System.out.println("Update " + produto);
		
		System.out.println("Remova do estoque : ");
		int removEstoque=sc.nextInt();
		produto.removerEstoque(removEstoque);
		
		System.out.println(produto);
		
		sc.close();
	}

}
