package Vetor;
import ListaLigada.ListaDuplamenteLigada;

public class MainTestes {
	public static void main(String[] args) {
		
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		
		lista.adicionaNoComeco("Paulo");
		System.out.println(lista);
		System.out.println(lista.tamanho());
		lista.adicionaNoComeco("Cleber");
		System.out.println(lista);
		System.out.println(lista.tamanho());
		lista.adicionaNoComeco("William");
		System.out.println(lista);
		System.out.println(lista.tamanho());
		lista.adiciona("Bia");
		System.out.println(lista);
		System.out.println(lista.tamanho());
		lista.adiciona("Chico");
		System.out.println(lista);
		System.out.println(lista.tamanho());
		lista.adiciona(2,"Wilson");
		System.out.println(lista);
		System.out.println(lista.tamanho());
		lista.remove(5);
		System.out.println(lista);
		System.out.println(lista.tamanho());
		lista.removeDoComeco();
		System.out.println(lista);
		System.out.println(lista.tamanho());
		lista.removeDoFim();
		System.out.println(lista);
		System.out.println(lista.tamanho());
	
		
		for(int i = 0; i < 30; i++) {
			lista.adicionaNoComeco("Wilson" + i);
			System.out.println(lista);
			System.out.println(lista.tamanho());
		}
		for(int i = 0; i < 30; i++) {
			lista.adiciona("Cleber" + i);
			System.out.println(lista);
			System.out.println(lista.tamanho());
		}
		for(int i = 0; i < 90; i += 2) {
			lista.adiciona(i, "Joao" + i);
			System.out.println(lista);
			System.out.println(lista.tamanho());
		}
		
		System.out.println(lista.pega(107));
		
	}
}
