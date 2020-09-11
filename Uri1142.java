import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){

        int N, x, cont;
        Scanner teclado = new Scanner(System.in);
        N = teclado.nextInt();
        cont = 1;

        for (x=1; x<=N; x++){
            System.out.println((cont)+" "+(cont+1)+" "+(cont+2)+" PUM");
            cont = cont + 4;

            
        }

    }
}