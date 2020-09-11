import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int base, altura, area;

        System.out.println("Por favor, digite o valor da base e altura do retangulo");
        base = teclado.nextInt();
        altura = teclado.nextInt();

        area = base * altura;

        System.out.println("A area do retanulo é "+area);
    
    }
}