package Exercicios.Exercicio03;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author wev kleyton
 * Ler o nome de 5 pessoas e imprimir todos os nomes com a ordem em que foram inseridos antes de cada nome
 */
public class Exercicio04 {
    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            String ent = JOptionPane.showInputDialog("Informe o Nome:");
            nome.add(String.valueOf(i) + " -> " + ent);
        }
        System.out.println(nome);
    }
}
