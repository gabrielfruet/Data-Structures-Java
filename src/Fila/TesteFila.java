package Fila;

public class TesteFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.insere("Mauricio");
		fila.insere("Guilherme");
		
		System.out.println(fila);
		
		fila.remove();
		
		System.out.println(fila);
	}
}
