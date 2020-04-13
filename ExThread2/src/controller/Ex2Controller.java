package controller;

public class Ex2Controller extends Thread{
	
	public int chave, soma;
	private int [][] matriz;
	
	
	public Ex2Controller(int chave, int soma, int[][] matriz) {
		this.chave = chave;
		this.soma = soma;
		this.matriz = matriz;
	}
	
	public int somaLinha(int m[][], int chave) {
		int soma = 0;
		for (int i=0; i<5; i++) {
			soma = m[chave][i] + soma;
		}
		return soma;
	}
	
	public void imprime() {
		int soma = somaLinha(matriz, chave);
		System.out.println("linha: "+chave+", soma = "+soma);
	}
	
	public void run(){
		imprime();
	}
	
}
