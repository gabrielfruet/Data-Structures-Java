package Fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<String> clientes = new LinkedList<String>();
	
	public void insere(String cliente) {
		clientes.add(cliente);
	}
	
	public String remove() {
		return clientes.remove(0);
	}
	
	public boolean vazia() {
		return clientes.isEmpty();
	}
	
	public String toString() {
		return clientes.toString();
	}
	
}
