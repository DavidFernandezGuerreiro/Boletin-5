
package boletin5.pkg2;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Boletin52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos5_2 obxConta=new Metodos5_2();
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduzca los dos valores : ");
        obxConta.verConta(sc.nextShort(), sc.nextShort());
    }
    
}
