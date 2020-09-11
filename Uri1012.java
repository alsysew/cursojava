import java.util.Scanner;
public class Uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C, TRI, CIRC, TRA, QUA, RET, PI;
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        PI = 3.14159;
        
        TRI= (A * C )/2;
        CIRC= C * C * PI;
        TRA = (A + B) * C / 2;
        QUA = B * B;
        RET = A * B;
        
       System.out.printf("TIANGULO: %.3f\n",TRI);
       System.out.printf("CIRCULO: %.3f\n",CIRC);
       System.out.printf("TRAPEZIO: %.3f\n",TRA);
       System.out.printf("QUADRADO: %.3f\n",QUA);
       System.out.printf("RETANGULO: %.3f\n",RET);
       
    }
}