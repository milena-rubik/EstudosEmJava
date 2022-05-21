/* Desenvolva um programa em Java que declara variáveis inteiras, char e String, receba dois números inteiros e uma opção, 
calcula o produto dos dois números se eles forem positivos (ex.: p = n1 * n2), calcula a produtória do primeiro número, o número 
e vezes do segundo e mostra as informações (ex.: p = p * n1). Usar estruturas de decisão e de múltipla escolha */

//clarificando a segunda parte do enunciado, se n1=2 e n2=3 seria a produtória de dois três vezes, 2^3.

import javax.swing.*;

public class _03_Escolha {
    public static void main(String entrada []) {
        int numero1, numero2, produto, produtoria=1;
        char opcao; 
        String mensagem = "Digite uma das opções abaixo \n 1 - calcula o produto dos dois números se eles forem positivos \n 2 - calcula a produtória";


        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));
        opcao = (JOptionPane.showInputDialog(mensagem)).charAt(0);

        switch(opcao) {
            case '1':{
                if (numero1>0 && numero2>0){
                    produto = numero1*numero2;
                    JOptionPane.showMessageDialog(null,"O resultado da multiplicação entre "+numero1+" e "+numero2+" é "+produto);
                }
                break;
            }
            case '2':{
                for(int i=1; i<=numero2; i=i+1){
                    produtoria = produtoria * numero1;
                }
                JOptionPane.showMessageDialog(null,"A produtória de "+numero1+", "+numero2+" vezes é "+produtoria);
                break;
            }
            default: JOptionPane.showMessageDialog(null,"Entradas inválidas");
            System.exit(0);
        }
    }
}
