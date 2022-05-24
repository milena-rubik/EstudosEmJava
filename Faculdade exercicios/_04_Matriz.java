/* Desenvolva um programa Java que declara matriz unidimensional (Vetor) de inteiros, receba números inteiros num vetor de 5 posições, calcula a somatória (ex.: s = s + vet[i]) 
e a produtória (ex.: p = p * vet[i]) desses números com um método similar a um procedimento e um método similar a uma função, ambos utilizando parâmetros, por fim, 
mostre essas informações na tela */

import javax.swing.*;

public class _04_Matriz {

    public static void somatoria(int vetor[]) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        JOptionPane.showMessageDialog(null, "A somatória de '2, 6, 8, 3, 8' é " + soma);//foi na força bruta não estou com saco para ficar fazendo for para imprimir um vetor desse tamanho

    }

    public static int produtoria(int vetor[]) {
        int prod = 1;
        for (int i = 0; i < vetor.length; i++) {
            prod = prod * vetor[1];
        }
        return prod;
    }

    public static void main(String entrada[]) {
        int p = 0, numeros[] = { 2, 6, 8, 3, 8 };

        somatoria(numeros);
        p = produtoria(numeros);
        JOptionPane.showMessageDialog(null, "A produtória de '2, 6, 8, 3, 8' é " + p);

        System.exit(0);

    }

}
