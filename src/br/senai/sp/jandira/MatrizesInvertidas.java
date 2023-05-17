package br.senai.sp.jandira;

public class MatrizesInvertidas {

	public static void main(String[] args) {

		int matrizA[] = new int[20];
		int matrizB[] = new int[20];
		int i = 1;
		
		matrizA[0] = 1;
		matrizA[1] = 2;
		matrizA[2] = 3;
		matrizA[3] = 4;
		matrizA[4] = 5;
		matrizA[5] = 6;
		matrizA[6] = 7;
		matrizA[7] = 8;
		matrizA[8] = 9;
		matrizA[9] = 10;
		matrizA[10] = 11;
		matrizA[11] = 12;
		matrizA[12] = 13;
		matrizA[13] = 14;
		matrizA[14] = 15;
		matrizA[15] = 16;
		matrizA[16] = 17;
		matrizA[17] = 18;
		matrizA[18] = 19;
		matrizA[19] = 20;
				
		while(i < matrizB.length + 1) {
			
			matrizB[i - 1] = matrizA[20 - i];
			System.out.println(i + "ª posição");
			System.out.println("A = " + matrizA[i-1]);
			System.out.println("B = " + matrizB[i-1]);
			System.out.println("");
	
			i++;
		}
			
	}

}
