package Conjunto;

public class TesteConjunto {

	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Joaozinho");
		System.out.println(conjunto);
		conjunto.adiciona("Cleberzinho");
		System.out.println(conjunto);
		conjunto.adiciona("Joaozinho");
		System.out.println(conjunto);
		conjunto.adiciona("Guilherme");
		System.out.println(conjunto);
		conjunto.adiciona("Jobson");
		System.out.println(conjunto);
		conjunto.remove("Jobson");
		System.out.println(conjunto);
		
	}

}
