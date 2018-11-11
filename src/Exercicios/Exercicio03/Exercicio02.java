package Exercicios.Exercicio03;

/**
 * @author Ricardo
 * Imprimir a soma dos 10 primeiros números.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i < 10; i++) {
            num += i;
        }
        System.out.println("Soma dos 10 primeiros numeros: " + num);
    }
}
