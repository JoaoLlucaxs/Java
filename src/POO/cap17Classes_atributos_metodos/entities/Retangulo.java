package POO.cap17Classes_atributos_métodos.entities;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double calcArea() {
		return largura * altura;
	}
	
	public double calcPerimetro() {
		return 2*(largura + altura);
	}
	
	public double calcDiagonal() {
		return Math.sqrt((largura * largura) + (altura * altura));
	}
	
	@Override
	public String toString() {
		return "Retangulo [largura=" + largura + ", altura=" + altura + "]";
	}
}
