package s1420out;

import java.util.Scanner;

public class Notas {
	
	public static double notas[][] = new double [3][4];
	public static double media[] = {0, 0, 0};
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Informe as notas dos alunos.");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				notas[i][j] = input.nextInt();
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				media[i] = media[i] + notas[i][j];
			}
			media[i] = media[i]/4;
		}
		for(int i = 1; i <= 3; i ++) {
			System.out.println("Média do aluno " + i + " é " + media[i-1]);
		}
	}
	
}
