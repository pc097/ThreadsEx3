package controller;

public class ThreadCalc3 extends Thread {

	private int[][] matriz = new int[3][5];

	public ThreadCalc3(int[][] matriz) {
		this.matriz = matriz;
	}

	@Override
	public void run() {
		somaMatriz();
	}

	private void somaMatriz() {
		int aux = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				while (i == 2) {
					aux += matriz[i][j];
					break;
				}
			}
		}
		System.out.println("Linha 3 da matriz -> soma dos valores -> " + aux);
	}
}
