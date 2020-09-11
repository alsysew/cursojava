import java.util.Scanner;

public class Uri1144{
    public static void main(String args[]){
        int N, x;
        Scanner teclado = new Scanner(System.in);

        N = teclado.nextInt();

        for (x=1; x<=N; x++){
            System.out.println(x+" "+(x*x)+" "+(x*x*x));
            System.out.println(x+" "+((x*x)+1)+" "+((x*x*x)+1));
        }
    }
}