
package boletin5.pkg7;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Boletin57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos5_7 obxCalcular=new Metodos5_7();
        Scanner sc=new Scanner (System.in);
        System.out.println("***** MENÚ  *****\n 1-CADRADO\n 2-TRIANGULO\n 3-CIRCULO\n Preme unha opción :\n");
        int op=sc.nextInt();
        obxCalcular.calcular(op);

    }
    
}
