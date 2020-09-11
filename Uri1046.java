import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int horaInicial, horaFinal, horas;
        horaInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();

        if (horaInicial == horaFinal){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if(horaInicial > horaFinal){
            horas = (24-horaInicial)+horaFinal;
            System.out.println("O JOGO DUROU "+horas+" HORA(S)");
        }
        else{
            horas = horaFinal-horaInicial;
            System.out.println("O JOGO DUROU "+horas+" HORA(S)");
        }
    }
}