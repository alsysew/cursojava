import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        int alc, gas, dis, valor;
        Scanner teclado = new Scanner(System.in);

        valor=0;
        alc = 0;
        gas = 0;
        dis = 0;
        
        while (valor !=4) {
            valor = teclado.nextInt();
            switch(valor){
                case 1: 
                    alc++;
                    break;
                case 2: 
                    gas++;
                    break;
                case 3: 
                    dis++;
                    break;
            }

        }
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: "+alc);    
    System.out.println("Gasolina: "+gas);
    System.out.println("Diesel: "+dis);
    }

}