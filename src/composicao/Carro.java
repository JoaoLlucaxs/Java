package composicao;

public class Carro {
	private String fabricante;
	private String modelo;
	private String cor;
	private int anoDeFabricacao;

	Proprietario dono;
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}



	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}



	public Proprietario getDono() {
		return dono;
	}



	public void setDono(Proprietario dono) {
		this.dono = dono;
	}



	@Override
	public String toString() {
		return "Carro [fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + ", anoDeFabricacao="
				+ anoDeFabricacao + ", dono=" + dono + "]";
	}
	
	
}
