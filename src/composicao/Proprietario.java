package composicao;

public class Proprietario {
	String nome;
	String cpf;
	int idade;
	String logradouro;
	String bairro;
	String cidade;
	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", logradouro=" + logradouro
				+ ", bairro=" + bairro + ", cidade=" + cidade + "]";
	}
	
	
}
