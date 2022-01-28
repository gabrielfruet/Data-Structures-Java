package Conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	
	ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	public Conjunto() {
		for(int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	
	public void adiciona(String palavra) {
		if(!contem(palavra)) {
			int indice = calculaIndicePalavra(palavra);
			List<String> lista = tabela.get(indice);
			lista.add(palavra);			
		}
	}
	private boolean contem(String palavra) {		
		return tabela.get(calculaIndicePalavra(palavra)).contains(palavra);
	}
	
	public String remove(String palavra) {
		int indice = calculaIndicePalavra(palavra);
		if(tabela.get(indice).contains(palavra)) {
			tabela.get(indice).remove(palavra);
			return palavra;
		}
		throw new IllegalArgumentException("Palavra nao consta!");
	}

	private int calculaIndicePalavra(String palavra) {
		
		return (palavra.toLowerCase().charAt(0) - 19) % 26;
	}
	
	public String toString() {
		return tabela.toString().toString();
	}
	 
}
