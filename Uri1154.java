import java.util.Scanner;

public class Uri1154{
    public static void main(String args[]){
        int idade, cont;
        float idadeTotal;
        Scanner teclado = new Scanner(System.in);

        cont = 0;
        idadeTotal = 0;

        while (true){
            idade = teclado.nextInt();
            if (idade < 0 ){
                break;
            }
            idadeTotal = idadeTotal + idade;
            cont++;

        }
        idadeTotal = idadeTotal / cont;
        System.out.printf("%.2f\n",idadeTotal);
      
    }
}