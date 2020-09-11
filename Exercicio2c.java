import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int base, altura;

        System.out.println("Por favor, digite o valor da base do tringulo");
        base = teclado.nextInt();
        System.out.println("Por favor, digite o valor da altura do triangulo");
        altura = teclado.nextInt();

        float area;
        area = (base * altura) / 2;

        System.out.println("A area do triangulo e "+area);

    }
}