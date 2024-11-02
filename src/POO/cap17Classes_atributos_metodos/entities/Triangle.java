package POO.cap17Classes_atributos_métodos.entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	// vai valer para x .. y
	public double area() {
		double p=(a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	/*
	 * Quais beneficios de se calcular a área de um triangulo por meio de um
	 * método dentro da CLASSE ?
	 * 
	 * - Reaproveitamento de código : Elimino o codigo repetido
	 * 
	 * - Delegação de responsabilidades : Quem deve ser responsavel por saber
	 * como calcular a área de um triangulo é o próprio triângulo
	 * essa lógica não é correto estar em outro lugar
	 * */
}
