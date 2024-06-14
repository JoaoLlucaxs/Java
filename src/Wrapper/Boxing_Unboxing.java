package Wrapper;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Tomar cuidado para não usar demais.. perde desempenho
		
		
		// Você não precisa instanciar um objeto 
		//Integer x= new Integer(10);
		Integer x=10; // não instancio..ele já entende como objeto..isso é chamado de boxing
		
		int i= x; // Unboxing
		
		// =========================================================================
		Integer i1=127;
		Integer i2 =127;
		
		Integer i3=128;
		Integer i4=128;
		
		System.out.println(i1 == i2); // true
		System.out.println(i3 == i4); // false
		
		// ???? Porque o primeiro da true e o segundo false?
		// i1 e i2 estão apontando para o mesmo objeto (é até 127 a -128)
		// i3 e i4 estão apontando para Objeto diferente pois a partir de 128 já apontam para objetos diferentes
	}

}
