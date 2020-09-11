import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        int i,cont, X;

        Scanner teclado = new Scanner(System.in);
    
        X = teclado.nextInt();
    
        if (X % 2 == 0){
            X = X + 1;
        }
    
        for (i=1 ; i<=6 ; i++){
            System.out.println(X);
            X = X + 2;
        }
    
    }
}