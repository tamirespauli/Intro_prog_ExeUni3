/* Uma loja de calçados está concedendo 12% de desconto nos produtos.
 Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos
  e quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário.
   Como resultado, o programa deverá exibir as seguintes mensagens:

O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx

Analise 


//Entrada 
 preço do par de sapatos

//Processo 

//Saida
O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx 
*/


import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        //entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Preço par de sapato: ");
        double sapatoPreco = teclado.nextDouble();
        //processo 
        double sapatoDesconto = (sapatoPreco * 0.12);
        double valorFinal = (sapatoPreco - sapatoDesconto);
        //saida 
        System.out.println("Valor do desconto: ");
        System.out.println(sapatoDesconto);
        System.out.println("Valor final com o desconto: ");
        System.out.println(valorFinal);

        teclado.close();
    }
}

