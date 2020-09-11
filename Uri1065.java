import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
    int cont, i, numero;

    Scanner teclado = new Scanner(System.in);
    
    cont = 0;

    for (i=1 ; i<=5 ; i = i + 1){
        numero = teclado.nextInt();
        if (numero % 2 == 0){
            cont = cont+1;
        }
    }
    System.out.println(cont+" valores pares");
    }
}