package POO.cap17Classes_atributos_métodos.entities;

public class Produto {
	
	public String nome;
	public Double preco;
	public Integer qtdEstoque;
	
	public double DadosDoProduto() {
		double valorTotal= qtdEstoque * preco;
		return valorTotal;
	}
	
	public void addEstoque(int qtdEstoque) {
		this.qtdEstoque += qtdEstoque;
	}
	
	public void removerEstoque(int qtdEstoque) {
		this.qtdEstoque -= qtdEstoque;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=$" + preco + ", qtdEstoque=" + qtdEstoque + "]";
	}
	
}
