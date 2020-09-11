import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
    int X, num;

    Scanner teclado = new Scanner(System.in);
    
    num = teclado.nextInt();

    for (X=1 ; X <=num ; X++){
        if (X % 2 != 0){
            System.out.println(X);
        }
    }
    
    }
}