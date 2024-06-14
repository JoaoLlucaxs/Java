package composicao;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro meuCarro = new Carro();
		meuCarro.setAnoDeFabricacao(2011);
		meuCarro.setCor("Prata");
		meuCarro.setFabricante("Fiat");
		meuCarro.setModelo( "Palio");
		
		meuCarro.dono= new Proprietario();
		meuCarro.dono.nome = "Joao da Silva";
		meuCarro.dono.bairro = "Centro";
		
		System.out.println(meuCarro);
	}

}
