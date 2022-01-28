package ListaLigada;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco(Object elemento) {
		this.primeira = new Celula(elemento, primeira);
		if(totalDeElementos == 0) {
			this.ultima = primeira;
		}
		
		this.totalDeElementos++;
	}
	
	private boolean posicaoOcupada(int pos) {
		return totalDeElementos <= pos;
	}
	
	public void adiciona(Object elemento) {
		
		if(totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		}else {		
			this.ultima.setProxima(new Celula(elemento, null));
			this.ultima = this.ultima.getProxima();
		}
		totalDeElementos++;
		
	}
	private Celula pegaCelula(int pos) {
		
		if(posicaoOcupada(pos)) {
			throw new IllegalArgumentException("Posicao inexistente");
		}
		
		Celula atual = this.primeira;
		
		for(int i = 0; i < pos; i++) {
			atual = atual.getProxima();
		}
		
		return atual;
	}
	
	public void adiciona(int pos, Object elemento) {
		
		if(pos == 0) {
			this.adicionaNoComeco(elemento);
		}else if(pos == totalDeElementos) {
			this.adiciona(elemento);
		}else {
			Celula atual = this.pegaCelula(pos - 1);
			Celula proxima = atual.getProxima();
			atual.setProxima(new Celula(elemento, proxima));
			totalDeElementos++;
		}
		
	}
	public Object pega(int posicao) {
		return pegaCelula(posicao).getElemento();
	}
	public void remove(int pos) {
		if(pos > totalDeElementos && pos < 0) {
			throw new IllegalArgumentException("Posicao invalida!");
		}
		Celula anterior = this.pegaCelula(pos - 1); 
		anterior.setProxima(anterior.getProxima().getProxima());
		this.totalDeElementos--;
		if(totalDeElementos == 0) {
			ultima = null;
		}
	}
	
	public void removeDoComeco() {
		if(totalDeElementos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		}
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
		if(totalDeElementos == 0) {
			ultima = null;
		}
	}
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	public boolean contem(Object elemento) {
		Celula atual = primeira;
		for(int i = 0; i < totalDeElementos; i++) {
			if(atual.getElemento() == elemento) {return true;}	
			atual = atual.getProxima();
		}
		return false;
	}
	
	@Override
	public String toString() {
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		Celula atual = primeira;
		
		StringBuilder builder = new StringBuilder("[");
		
		for(int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProxima();
		}
		
		builder.append("]");
		
		return builder.toString();
	}
	
	
}
