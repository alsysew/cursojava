import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int baseMaior, baseMenor, altura, area;

        System.out.println("Digite Base Maior, Base Menor e Alture");
            baseMaior = teclado.nextInt();
            baseMenor = teclado.nextInt();
            altura = teclado.nextInt();

        area = (baseMaior + baseMenor)* altura /2;

        System.out.println("A area do trapezio e "+area);

    }
}