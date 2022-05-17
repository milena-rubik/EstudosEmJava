//TESTAR ESSE CÓDIGO! AINDA NÃO FIZ ISSO

//Com os conhecimentos adquiridos até agora, desenvolva um programa em Java que declara variáveis inteiras, reais e String, recebe dois números 
//inteiros usando interface com usuário, calcula o quociente da divisão dos dois números, a potência do primeiro número pelo segundo número e mostra 
//essas informações usando interface com usuário

import javax.swing.*;

public class _02_DivisaoPotencia
{
  public static void main (String entrada[])
    {
     int n1, n2, pot; 
     double rediv;
     String msg = "";
     
     n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro ")); //Solicita entrada na interface do usuário funciona com a biblioteca importada no início
     n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro "));
     rediv = n1 / n2; 
     pot = (int) Math.pow(n1,n2); //em java não tem operador para potência como 'n1**n2'
     msg = "O quociente da divisão de " + n1 + "por" + n2 + "é" + rediv + "\n" + n1 + "elevado a " + n2 + "é" + pot;
     JOptionPane.showMessageDialog(null,msg); //exibir msg na interface do usuário 
     
     System.exit(0);
    }
}
