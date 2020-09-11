import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
    int cont, i;
    float numero;
    Scanner teclado = new Scanner(System.in);
    
    cont = 0;

    for (i=1 ; i<=6 ; i = i + 1){
        numero = teclado.nextFloat();
        if (numero >=0){
            cont = cont+1;
        }
    }
    System.out.println(cont+" valores positivos");
    }
}