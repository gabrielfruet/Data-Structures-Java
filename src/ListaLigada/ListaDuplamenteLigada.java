package ListaLigada;

public class ListaDuplamenteLigada {

	private CelulaDL primeira = null;
	private CelulaDL ultima = null;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco(Object elemento) {
		
		if(totalDeElementos == 0) {
			this.primeira = new CelulaDL(elemento, primeira);
			this.ultima = primeira;
		}else {
			CelulaDL nova = new CelulaDL(elemento, primeira);
			primeira.setAnterior(nova);
			primeira = nova;
		}
		
		
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
			CelulaDL nova = new CelulaDL(elemento, null, ultima);
			this.ultima.setProxima(nova);
			this.ultima = nova;
			totalDeElementos++;
		}
		
	}
	private CelulaDL pegaCelula(int pos) {
		
		if(posicaoOcupada(pos)) {
			throw new IllegalArgumentException("Posicao inexistente");
		}
		
		CelulaDL atual;
		if(pos > totalDeElementos/2) {
			atual = this.ultima;
			for(int i = totalDeElementos - 1; i > pos; i--) {
				atual = atual.getAnterior();
			}
		}else {
			atual = this.primeira;
			for(int i = 0; i < pos; i++) {
				atual = atual.getProxima();
			}
		}
		
		
		return atual;
	}
	
	public void adiciona(int pos, Object elemento) {
		
		if(pos == 0) {
			this.adicionaNoComeco(elemento);
		}else if(pos == totalDeElementos) {
			this.adiciona(elemento);
		}else {
			CelulaDL anterior = this.pegaCelula(pos - 1);
			CelulaDL proxima = anterior.getProxima();
			
			CelulaDL nova = new CelulaDL(elemento, proxima, anterior);
			
			anterior.setProxima(nova);
			proxima.setAnterior(nova);
			totalDeElementos++;
		}
		
	}
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	public void remove(int pos) {
		if(pos > totalDeElementos && pos < 0) {
			throw new IllegalArgumentException("Posicao invalida!");
		}
		if(totalDeElementos - 1 == pos) {
			removeDoFim();
		}else {
			CelulaDL anterior = this.pegaCelula(pos - 1); 
			anterior.setProxima(anterior.getProxima().getProxima());
			anterior.getProxima().setAnterior(anterior);
			this.totalDeElementos--;
			if(totalDeElementos == 0) {
				this.ultima = null;
		}
		
		
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
	public void removeDoFim() {
		ultima = ultima.getAnterior();
		ultima.setProxima(null);
		totalDeElementos--;
	}
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	public boolean contem(Object elemento) {
		CelulaDL atual = primeira;
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
		
		CelulaDL atual = primeira;
		
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
