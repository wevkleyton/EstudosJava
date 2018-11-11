package Exercicios.Exercicio03;

import javax.swing.JOptionPane;

/**54
 * @author wev
 * Considere a soma de todas as combinações inteiras de ab para 2 ≤ a ≤ 3 e 2 ≤ b ≤ 3: 22 + 23 +32 + 33 =
 * 48. Faça um programa que receba os valores mínimo e máximo para a e b e apresente esta soma.
 */

public class Exercicio35_1 {

    public static void main(String[] args) {
        int total = 0 ,vl1, vl2, vl3, vl4;
        vl1 = Integer.parseInt(JOptionPane.showInputDialog("informa o numero Minimo de A:"));
        vl2 = Integer.parseInt(JOptionPane.showInputDialog("informa o numero Maximo de A:"));
        vl3 = Integer.parseInt(JOptionPane.showInputDialog("informa o numero Minimo de B:"));
        vl4 = Integer.parseInt(JOptionPane.showInputDialog("informa o numero Maximo de A:"));

        for (int i = vl1; i <= vl2; i++) {
            for (int j = vl3; j <= vl4; j++) {
                int result = (int) Math.pow(i,j);
                total+= result;
            }
        }
        System.out.println("O Valor da soma e: " + total);

    }
}
