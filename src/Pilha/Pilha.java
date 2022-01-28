package Pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

	private List <String> lista = new LinkedList <String>();

	public void insere(String nome) {
		lista.add(nome);
	}
	public String remove() {
		if(vazio()) {
			throw new IllegalArgumentException("Impossivel remover de uma pilha vazia");
		}
		return lista.remove(lista.size() - 1);
	}
	public boolean vazio() {
		return lista.isEmpty();
	}
	
	public String toString() {
		
		return lista.toString();
		
	}
	
	
}
