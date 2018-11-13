package Exercicios.Exercicio03;

import java.util.Scanner;

/**
 * 
 * @author wev
 * Entrar com varios numeros e informar quantos numeros entre 100 e 200 foram digitados. O programa cessa execução ao se digitar 0.
 */
public class Exercicio17 {
	public static void main(String[] args) {
		int parada = 0 , count = 0;
		Scanner scan = new Scanner(System.in);
		do {
			parada = Integer.parseInt(scan.nextLine());
			if (parada >=100 && parada <= 200) {
				count ++;	
			}
		}while (parada != 0 );
			System.out.println("Numeros Entre 100 e 200 : " + count);
		
	}

}
