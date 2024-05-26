package condicional;

public class TestandoCondicionaisBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade=20;
		int qtdAcompanhateMaiorDeIdade=3;
		
		if(idade >= 18) {
			System.out.println("Você tem mais de 18 anos!!");
		}else if(qtdAcompanhateMaiorDeIdade >= 3) {
			System.out.println("Você não tem 18 anos, mas pode entrar pois está acompanhado "
					+ "com pessoas responsaveis");
		}else {
			System.out.println("Desculpe, você não pode entrar");
		}
	}

}
