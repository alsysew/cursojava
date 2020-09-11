import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        int qtd, N, i;

        Scanner teclado = new Scanner(System.in);
        qtd = teclado.nextInt();

    
        for (i=1 ; i<=qtd ; i = i + 1){
            N = teclado.nextInt();

            if (N == 0){
                System.out.println("NULL");    
            }
            else if(N % 2 == 0){
                if (N > 0){
                    System.out.println("EVEN POSITIVE");     
                }
                else{
                    System.out.println("EVEN NEGATIVE"); 
                }
            }
            else if (N > 0){
                System.out.println("ODD POSITIVE");     
            }
            else{
                System.out.println("ODD NEGATIVE"); 
            }
        }
    }
}