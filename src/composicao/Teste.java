package composicao;

public class Teste {

	public static void main(String[] args) {
		/*COMPOSIÇÃO -> "TEM UM" , SE O TODO PASSA A NÃO EXISTIR ENTÃO AS PARTES TAMBÉM PASSA
		* O LADO BOM DA COMPOSIÇÃO É QUE PODEMOS ALTERAR AS PARTES (OU SUBSTITUIR SEM ALTERAR TODA A ESTRUTURA)
		* */



		// TODO Auto-generated method stub
		Carro meuCarro = new Carro();
		meuCarro.setAnoDeFabricacao(2011);
		meuCarro.setCor("Prata");
		meuCarro.setFabricante("Fiat");
		meuCarro.setModelo( "Palio");

		// é necessário instanciar o proprietário mesmo compondo no Carro
		//pois precisaremos dos dados do dono que estão na classe Proprietario
		meuCarro.dono= new Proprietario();
		meuCarro.dono.nome = "Joao da Silva";
		meuCarro.dono.bairro = "Centro";
		
		System.out.println(meuCarro);
	}

}
