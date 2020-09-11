import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
    int cont, i;
    float numero, media;
    Scanner teclado = new Scanner(System.in);
    
    cont = 0;
    media = 0;

    for (i=1 ; i<=6 ; i = i + 1){
        numero = teclado.nextFloat();
        if (numero >=0){
            cont = cont+1;
            media = media + numero;
        }
    }
    media = media/cont;
    System.out.println(cont+" valores positivos");
    System.out.printf("%.1f\n",media);
    }
}