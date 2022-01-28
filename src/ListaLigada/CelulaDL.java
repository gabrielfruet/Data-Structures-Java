package ListaLigada;

public class CelulaDL {

	private Object elemento;
	private CelulaDL proxima;
	private CelulaDL anterior;
	
	public CelulaDL(Object elemento, CelulaDL proxima, CelulaDL anterior) {
		this.elemento = elemento;
		this.proxima = proxima;
		this.anterior = anterior;
	}
	
	public CelulaDL(Object elemento, CelulaDL proxima) {
		this.elemento = elemento;
		this.proxima = proxima;
	}

	public Object getElemento() {
		return elemento;
	}

	public CelulaDL getProxima() {
		return proxima;
	}

	public void setProxima(CelulaDL proxima) {
		this.proxima = proxima;
	}

	public CelulaDL getAnterior() {
		return anterior;
	}

	public void setAnterior(CelulaDL anterior) {
		this.anterior = anterior;
	}
	
}
