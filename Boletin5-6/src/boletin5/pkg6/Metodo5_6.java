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
public class Metodo5_6 {
    private int num;
    
    public void verVentas(int num){
        if(num <= 100){
            System.out.println("Baixo");
        }
        else if(num > 100 && num <=500){
            System.out.println("Medio");
            }
        else{
            if(num > 500 && num <= 1000){
                System.out.println("Alto");
            }
            else{
                System.out.println("Primera necesidade");
            }
        }
    }
}
