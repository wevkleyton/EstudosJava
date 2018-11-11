package Exercicios.Exercicio02;

import javax.swing.*;

/**
 * Ler as 4 notas de um aluno, calcular a média e imprimir a situação do aluno: Reprovado ou Aprovado.
 * Considere a média de aprovação como sendo 7.
 */
public class Exercicio14 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informa a Primeira Nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informa a Primeira Segunda"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informa a Primeira Terceira"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informa a Primeira Quarta"));

        media = (nota1 + nota2 + nota3 + nota4)/4 ;

        if (media >= 7){
            JOptionPane.showMessageDialog(null, "Aluno Apovado");
        }else{
            JOptionPane.showMessageDialog(null, "Aluno Repovado");
        }
    }
}
