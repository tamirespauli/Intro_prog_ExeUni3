/*Um motorista deseja abastecer seu tanque de combustível. 
Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento 
e exibir quantos litros ele conseguiu colocar no tanque.

//entrada 
 preço do litro da gasolina e o valor do pagamento 

//processo
valorPagamento/valorLitro 

//saida 
quantos litros ele conseguiu colocar no tanque

 * 
 */
import java.util.Scanner;
public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //entrada 
        System.out.print("Preço do litro da gasolina: ");
        double valorLitro = teclado.nextDouble();
        System.out.print("Valor a ser pago: ");
        double  valorPago = teclado.nextDouble();
        
        //processo 
        double litroQuant = (valorPago/valorLitro);

        //saida
        System.out.print("Quantidade de litros abastecidos: ");
        System.out.print(litroQuant);
        teclado.close();
    }
}
