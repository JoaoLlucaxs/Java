package POO.cap17Classes_atributos_m�todos.entities;

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
	 * Quais beneficios de se calcular a �rea de um triangulo por meio de um
	 * m�todo dentro da CLASSE ?
	 * 
	 * - Reaproveitamento de c�digo : Elimino o codigo repetido
	 * 
	 * - Delega��o de responsabilidades : Quem deve ser responsavel por saber
	 * como calcular a �rea de um triangulo � o pr�prio tri�ngulo
	 * essa l�gica n�o � correto estar em outro lugar
	 * */
}
