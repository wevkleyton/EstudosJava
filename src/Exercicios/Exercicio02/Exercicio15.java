package Exercicios.Exercicio02;

import javax.swing.*;

/**
 * Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor
 * que R$ 20,00; caso contrário, o lucro será de 30%. Entrar com o valor do produto e imprimir o valor da venda.
 */
public class Exercicio15 {
    public  void venda(){
        double vlCompra = Double.parseDouble(JOptionPane.showInputDialog("Informa o valor de Compra do produto"));
        if (vlCompra < 20.00){
            vlCompra += vlCompra * 0.20;
            JOptionPane.showMessageDialog(null, "O valor de Venda e de: " + vlCompra);
        }else {
            vlCompra += vlCompra * 0.30;
            JOptionPane.showMessageDialog(null, "O valor de Venda e de: " + vlCompra);
        }
    }

    public static void main(String[] args) {
        Exercicio15 ex = new Exercicio15();
        ex.venda();
    }
}
