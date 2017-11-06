/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg6;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Boletin56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodo5_6 obxVentas=new Metodo5_6();
        Scanner sc=new Scanner (System.in);
        obxVentas.verVentas(sc.nextInt());
    }
    
}
