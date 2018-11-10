package Exercicios.Lista03;

import javax.swing.JOptionPane;
/**
 * @author wev
 * Ler um número qualquer e exibir a soma de todos os seus dígitos. Ex: 2504. 2 + 5 + 0 + 4 = 11
 */

public class Exercicio31 {

	public static void main(String[] args) {
		int x;
		int soma = 0;

		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº: "));
		System.out.println("Numero: " + x);

		char[] num = (x + "").toCharArray();
		for (char c : num) {
			int i = Integer.parseInt(c + "");
			System.out.print(i + " ");
			soma += i;
		}
		System.out.println("\nSoma = " + soma);
	}
}
