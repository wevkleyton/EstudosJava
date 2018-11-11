package Exercicios.Aulas;

import javax.swing.*;

/**
 *
 */
public class TestaFor {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero"));

        if (num > num1) {
            for (int i = num; i <= num1; i++) {
                System.out.print(i + ", ");
            }
        } else if (num < num1) {
            for (int i = num; i <= num1; i++) {
                System.out.print(i + ", ");
            }

        } else if (num == num1) {
            System.out.println(num);
        }
    }
}
