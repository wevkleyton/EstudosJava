package Exercicios.Exercicio01;

import javax.swing.*;

/**
 * 13. Entrar com o nome e as 4 notas de um aluno e imprimir o nome e a média desse aluno.
 */
public class Exercicio13 {
    public static void main(String[] args) {
        String nome = null ;
        double nota1, nota2, nota3, nota4, media;
        nome = JOptionPane.showInputDialog("Informa o Nome do Aluno?");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informa a Primeira Nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informa a Segunda Nota"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informa a terceira Nota"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informa a Quarta Nota"));

        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.printf("Nome: %s Media: %s" , nome, media);

    }
}
