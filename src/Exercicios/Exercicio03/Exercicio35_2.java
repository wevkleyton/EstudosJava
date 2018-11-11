package Exercicios.Exercicio03;

import javax.swing.*;

/**
 * @author wev
 * Faça um programa para simular um saque em um caixa eletrônico com a menor quantidade de notas
 * possíveis. O programa deverá apresentar a quantidade de notas de cada valor que foram sacadas.
 * Considere somente notas de 2, 5, 10, 20, 50 e 100 reais. Ex: Valor do saque: 150. Notas: 100 = 1, 50 = 1,
 * 10 = 1.
 */
public class Exercicio35_2 {

    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informa o valor de Saque"));
        int vlsaque = valor ;
        int[] cedulas = {100, 50, 20, 10, 5, 2};
        int[] temp = new int[6];
        for (int i = 0; i < cedulas.length; i++) {
            if (valor >= cedulas[i]) {
                temp[i] = valor / cedulas[i];
                valor = valor % cedulas[i];
                if (valor >= cedulas[i]) {
                    temp[i] = valor / cedulas[i];
                    valor = valor % cedulas[i];
                }

            }
        }
        JOptionPane.showMessageDialog(null, "Os Valores de Nodas Sao : \n Notas de R$100 : " + temp[0]
        + "\n Notas de R$50 : " + temp[1] + "\n Notas de R$20 : " + temp[2] + "\n Notas de R$10 : " + temp[3]
        +"\n Notas de R$5 : " + temp[4] + "\n Notas de R$2 : " + temp[5] + "\n Total de : R$" + vlsaque );
    }
}
