import java.util.Scanner;

public class Uri1157{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N;
        N = teclado.nextInt();
        for (int i=1; i<=N; i++){
            if(N%i == 0){
                System.out.println(i);


            }
        }

    }
}