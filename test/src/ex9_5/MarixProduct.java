package ex9_5;

import java.util.Scanner;

public class MarixProduct {

	public static void main(String[] args) {
		//선언
		Scanner stdIn = new Scanner(System.in);
		
		int[][] a = new int [4][3];
		int[][] b = new int [3][4];
		int[][] c = new int [4][4];
		
		//a행렬입력
		for(int i= 0; i < 4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("b[%d][%d] : ", i, j);
				b[i][j] = stdIn.nextInt()
			}
		}

	}

}
