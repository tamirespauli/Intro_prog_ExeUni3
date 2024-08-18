
/*Um restaurante cobra R$ 25,00 por cada quilo de 
refeição. Escreva um programa que leia o peso do prato
 montado pelo cliente (em quilos) e imprima o
 valor a pagar. O peso do prato é de 750 gramas. 
 //entrada 
 Peso do prato montado 

 //processo 
 peso do prato montado - 750g (x kg - 0,750)
 PESO FINAL * 25 

 saida 
 valor do prato 
 
 */
import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // entrada
        System.out.print("Digite o peso do prato em KG (Ex:0,800kg): ");
        double pesoPrato = teclado.nextDouble();
        // processo

        teclado.close();
    }
}
