import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario, imposto;
       

        salario = teclado.nextDouble();
        if (salario <= 2000){
            System.out.prontln(Isento);
        }

        else if (salario <= 3000){
            imposto = (salario - 2000*0.08);
            System.out.printf("R$ %.2f\n",imposto)
        }
        else if (salario <= 4500.00){
            imposto =(salario - 3000)*0.08 + 80.0;
            System.out.printf("R$ %.2f\n",imposto)
        
        }
        else{
            imposto = (salario -4500.0*0.28) + 270.0 + 80.0
            System.out.printf("R$ %.2f\n",imposto)
        }
    }
}