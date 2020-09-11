import java.util.Scanner;
    
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double A,B,C;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        if ((A+B > C) && (A+C > B) && (B+C >A)){
            System.out.println("Perimetro = "+(A+B+C));    
        }
        else {
            System.out.println("Area = "+((A+B)* C /2));
        }
    }
}
