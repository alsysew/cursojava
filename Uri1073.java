import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        int valor, cont;

        Scanner teclado = new Scanner(System.in);
    
        valor = teclado.nextInt();
    
        for (cont=2 ; cont<=valor ; cont=cont+2){
            System.out.println(cont+"^2 = "+(cont*cont));
        }
    
    }
}