package Vetor;
import java.util.Arrays;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	
	private int tamanhoAtual = 100;
	
	private int totalDeAlunos = 0;
	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco(totalDeAlunos);
		this.alunos[totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}	
	private void garanteEspaco(int pos) {
		if(pos >= this.alunos.length) {
			this.tamanhoAtual += 100;
			Aluno[] aux = new Aluno[this.tamanhoAtual];
			for(int i = 0; i < alunos.length; i++) {
				aux[i] = this.alunos[i];
			}
			this.alunos = aux;
		}
	}
	private boolean posicaoValida(int pos) {
		return pos >= 0 && pos <= totalDeAlunos;
	}	
	public void adiciona(int pos, Aluno aluno) {
		this.garanteEspaco(pos);
		if(!posicaoValida(pos)) {
			throw new IllegalArgumentException("Posicao invalida!");
		}
		
		for(int i = this.totalDeAlunos - 1; i >= pos; i--) {
			this.alunos[i + 1] = this.alunos[i];
		}
		this.alunos[pos] = aluno;
		this.totalDeAlunos++;
	}	
	private boolean ocupada(int pos) {
		return pos >= 0 && pos < this.totalDeAlunos;
	}
	public Aluno pega(int pos) {
		if(!ocupada(pos)) {
			throw new IllegalArgumentException("Posicao invalida!");
		}
		return this.alunos[pos];		
	}
	public void remove(int pos) {
		
		for(int i = pos; i < this.totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}	
		this.totalDeAlunos--;
	}
	public boolean contem(Aluno aluno) {
		for(int i = 0; i < totalDeAlunos; i++) {
			if(this.alunos[i].equals(aluno)) {
				return true;
			}
		}	
		return false;
	}
	public int tamanho() {
		return this.totalDeAlunos;
	}
	@Override
	public String toString() {



		return Arrays.toString(this.alunos);
	}
	public int getTamanhoAtual() {
		return tamanhoAtual;
	}
	
	 
}
