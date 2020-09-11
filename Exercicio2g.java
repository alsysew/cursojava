import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int altura, largura, profundidade, volume;

        System.out.println("Por favor, digite o valor da altura do paralelepipedo");
            altura = teclado.nextInt();
        System.out.println("Por favor, digite o valor da largura do paralelepipedo");
            largura = teclado.nextInt();
        System.out.println("Por favor, digite o valor do comprimento do paralelepipedo");
            profundidade = teclado.nextInt();

        volume = (altura * largura * profundidade);

        System.out.println("O volume do paralelepitedo e "+volume);

    }
}