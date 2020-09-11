import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        float raio, altura, volume, pi;

        System.out.println("Digite raio e altura do cilindro");
            raio = teclado.nextFloat();
            altura = teclado.nextFloat();

            pi = 3.14f;

        volume = raio * altura * pi * altura;

        System.out.println("A area do cilinfor e "+volume);

    }
}