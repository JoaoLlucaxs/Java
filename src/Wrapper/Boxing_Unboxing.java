package Wrapper;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Tomar cuidado para n�o usar demais.. perde desempenho
		
		
		// Voc� n�o precisa instanciar um objeto 
		//Integer x= new Integer(10);
		Integer x=10; // n�o instancio..ele j� entende como objeto..isso � chamado de boxing
		
		int i= x; // Unboxing
		
		// =========================================================================
		Integer i1=127;
		Integer i2 =127;
		
		Integer i3=128;
		Integer i4=128;
		
		System.out.println(i1 == i2); // true
		System.out.println(i3 == i4); // false
		
		// ???? Porque o primeiro da true e o segundo false?
		// i1 e i2 est�o apontando para o mesmo objeto (� at� 127 a -128)
		// i3 e i4 est�o apontando para Objeto diferente pois a partir de 128 j� apontam para objetos diferentes
	}

}
