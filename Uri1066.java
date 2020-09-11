import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
    int i, par, imp, pos, neg, numero;

    Scanner teclado = new Scanner(System.in);
    
    par = 0;
    imp = 0;
    pos = 0;
    neg = 0;
    
    for (i=1 ; i<=5 ; i = i + 1){
        numero = teclado.nextInt();
        if (numero % 2 == 0){
            par = par + 1;
        }
        else{
            imp = imp + 1;
        }
        if (numero > 0){
            pos = pos + 1;
        }
        else if (numero < 0){
            neg = neg + 1;
        }
    }
    System.out.println(par+" valor(es) par(es)");
    System.out.println(imp+" valor(es) impar(es)");
    System.out.println(pos+" valor(es) positivo(s)");
    System.out.println(neg+" valor(es) negativo(s)");
    }
}