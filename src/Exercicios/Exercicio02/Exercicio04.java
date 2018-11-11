package Exercicios.Exercicio02;
//Entrar com um número e imprimir a raiz quadrada caso seja positivo e o quadrado caso seja negativo.

import javax.swing.*;

public class Exercicio04 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número"));
        if (num >= 1 ){
            JOptionPane.showMessageDialog(null,"Raiz Quadrada: " + Math.sqrt(num));
        }else if (num <= -1){
            JOptionPane.showMessageDialog(null,"Raiz Quadrada: " + Math.pow(num , 2));
        }else{
            JOptionPane.showMessageDialog(null,"O Valor e 0 ");
        }
    }
}
