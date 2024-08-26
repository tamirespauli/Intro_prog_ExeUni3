
/*Descreva um programa que a partir da distância percorrida e o do 
tempo gasto por um motorista durante uma viagem de final de semana, 
calcule a velocidade média e a quantidade de combustível gasto na 
viagem, sabendo que o automóvel faz 12 km por litro. */
import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a distância (km) percorrida: ");
        double distancia = teclado.nextDouble();
        System.out.println("Digite o tempo gasto (horas): ");
        double tempo = teclado.nextDouble();
        double consumo = 12.00;

        double velocidadeMedia = distancia / tempo;
        double quantCombustivel = distancia / consumo;

        System.out.println("Velocidade média: " + velocidadeMedia);
        System.out.println("Quandiade de combustível gasto: " + quantCombustivel);

        teclado.close();
    }
}
