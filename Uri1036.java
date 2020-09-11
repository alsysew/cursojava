import java.util.Scanner;

public class Uri1036{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C;
        double delta, R1, R2;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        delta = Math.pow(B,2) - 4 * A * C;
        

        int horaI, minutoI, horaF, minutoF, horas, minutos, duracaoI, duracaoF, total;
        horaI = teclado.nextInt();
        minutoI = teclado.nextInt();
        horaF = teclado.nextInt();
        minutoF = teclado.nextInt();