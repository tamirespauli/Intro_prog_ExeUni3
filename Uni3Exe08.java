/*  Uma pessoa foi até uma casa de câmbio trocar 
dólares por reais. Para isto ela entregou um valor
 em dólares para o atendente. Considerando que o
 atendente tem a cotação do dólar, descreva um programa 
 para calcular quantos reais o atendente
 deve devolver para a pessoa. 

 // entrada 
 valor em US$

 processo 
 valor em US$ * 5.47

 //SAIDA 
 valor final
 */
import java.util.Scanner;
public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //entrada 
        System.out.print("Valor em US$: ");
        double valorUs = teclado.nextDouble();
        //processo
        double valorFinal = valorUs * 5.47; 
        //saida 
        System.out.print("Valor totoral em R$: ");
        System.out.print(valorFinal);
 
        teclado.close();
    }
}
