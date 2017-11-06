
package boletin5.pkg3;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Boletin53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos5_3 obxSimbolo=new Metodos5_3();
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduzca número :");
        obxSimbolo.mostrarSimbolos(sc.nextInt());
    }
    
}
