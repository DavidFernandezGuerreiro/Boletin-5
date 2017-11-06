/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg5;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Boletin55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos5_5 obxMayor=new Metodos5_5();
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduzca 3 valores :");
        obxMayor.VerMayor((sc.nextInt()), (sc.nextInt()), (sc.nextInt()));
        
    }
    
}
