package Pilha;

public class TestePilha {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.insere("Mauricio");
		
		System.out.println(pilha);
		
		pilha.insere("Joao");
		
		System.out.println(pilha);
		
		System.out.println(pilha.remove());
		
		System.out.println(pilha); 
		
		System.out.println(pilha.remove());
		
		System.out.println(pilha);
		
		System.out.println(pilha.remove());
		
		System.out.println(pilha);
	}

}
