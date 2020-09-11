import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int diagonal1, diagonal2;

        System.out.println("Por favor, digite o valor da diagonal 1 do losango");
        diagonal1 = teclado.nextInt();
        System.out.println("Por favor, digite o valor da diagonal 2 do losango");
        diagonal2 = teclado.nextInt();

        int area;
        area = diagonal1 * diagonal2;

        System.out.println("A area do losango e "+area);

    }
}