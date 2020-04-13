package view;

import java.util.Random;

import controller.Ex2Controller;

public class Ex2Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[3][5];
		Random ale = new Random();
		for(int i=0;i<3; i++) {
			for (int j=0; j<5; j++) {
				matriz[i][j] = ale.nextInt(10);
			}
		}
		
		for(int i=0; i<3; i++) {
			Thread obj = new Ex2Controller(i,0, matriz);
			obj.start();
		}
		

			

	}

}
