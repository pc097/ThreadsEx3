package view;
import java.util.Random;

import controller.ThreadCalc;
import controller.ThreadCalc2;
import controller.ThreadCalc3;
public class Main {

	public static void main(String[] args) {

		int[][] matriz = new int[3][5];
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = random.nextInt(100);
				System.out.println("matriz [" + (i+1) + "][" + (j+1) + "]" + matriz[i][j]);
			}
		}
		Thread threadCalc = new ThreadCalc(matriz);
		Thread threadCalc2 = new ThreadCalc2(matriz);
		Thread threadCalc3 = new ThreadCalc3(matriz);
		threadCalc.start();
		threadCalc2.start();
		threadCalc3.start();
	}
}
