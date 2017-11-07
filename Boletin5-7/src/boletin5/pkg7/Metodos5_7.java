
package boletin5.pkg7;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Metodos5_7 {
    Scanner sc=new Scanner (System.in);
    private float lado;
    private float base;
    private float altura;
    private static float PI=3.14F;
    private float radio;
    
    public void calcular(int op){
        switch(op){
            case 1: System.out.println("Inserte lado :");
                    float lado=sc.nextFloat();
                    System.out.println("lado * lado = "+(lado*lado));
                    break;
            case 2: System.out.println("Inserte base :");
                    float base=sc.nextFloat();
                    System.out.println("Inserte altura :");
                    float altura=sc.nextFloat();
                    System.out.println("base * altura = "+(base*altura));
                    break;
            case 3: System.out.println("Inserte radio :");
                    float radio=sc.nextFloat();
                    System.out.println("PI * radio al cuadrado = "+(PI*Math.pow(radio, 2)));
                    break;
            default: System.out.println("* OPCIÓN INCORRECTA *");
        }
        
    }
}
