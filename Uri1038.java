import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int cod, quant;
        double valor;
        cod = teclado.nextInt();
        quant = teclado.nextInt();


        if (cod == 1){
            valor = quant * 4;
            System.out.printf("Total: R$ %.2f\n",valor);
        }
        else if (cod == 2){
            valor = quant * 4.50;
            System.out.printf("Total: R$ %.2f\n",valor);
        }

        else if (cod == 3){
            valor = quant * 5;
            System.out.printf("Total: R$ %.2f\n",valor);
        }

        else if (cod == 4){
            valor = quant * 2;
            System.out.printf("Total: R$ %.2f\n",valor);
        }

        else if (cod == 5){
            valor = quant * 1.50;
            System.out.printf("Total: R$ %.2f\n",valor);
        }

    }


}
