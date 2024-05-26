package escopos;

public class TestaEscopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade=16;
		int qtdPessoas=3;
		
		//boolean qtdAcompanhanteMaiorDeIdade=qtdPessoas >= 3;
		
		boolean acompanhado;
		
		if(qtdPessoas >=2) {
			acompanhado=true;
		}else {
			acompanhado=false;
		}
		
		
		if(idade >= 18 || acompanhado) {
			System.out.println("Você pode passar");
		}else {
			System.out.println("Desculpe, você não pode entrar");
		}
	}

}
