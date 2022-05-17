public class _01_Divisao {
    public static void main(String entrada[]) {
        int n1, n2; // declara as variáveis n1 e n2 como inteiro
        double x; // declara a variavel x como real
        n1 = Integer.parseInt(entrada[0]); // Transforma o argumento / entrada 1 em inteiro (original vem como string)
        n2 = Integer.parseInt(entrada[1]); // Transforma o argumento / entrada 2 em inteiro (original vem como string)
        x = n1 / n2; // Apesar do x ser double, por dividirmos dois inteiros o resultado é apenas o
                     // quociente inteiro sem resto
        System.out.println(x); // imprime no sistema o valor de x
        System.exit(0);
    }
}


//para executar esse programa no cmd devo digitar java Divisao argumento1 argumento2, exemplo: java _01_Divisao 1 4. 
//Nesse caso a entrada(0) recebe 1 e a entrada(1) recebe 4
