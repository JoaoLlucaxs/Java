package condicional;

public class TestandoCondicionaisBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade=20;
		int qtdAcompanhateMaiorDeIdade=3;
		
		if(idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos!!");
		}else if(qtdAcompanhateMaiorDeIdade >= 3) {
			System.out.println("Voc� n�o tem 18 anos, mas pode entrar pois est� acompanhado "
					+ "com pessoas responsaveis");
		}else {
			System.out.println("Desculpe, voc� n�o pode entrar");
		}
	}

}
