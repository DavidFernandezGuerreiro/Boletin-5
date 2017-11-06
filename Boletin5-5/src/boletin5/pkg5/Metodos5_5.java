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
public class Metodos5_5 {
    private int num1, num2, num3;
    
    public void VerMayor(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            System.out.println("El número mayor es "+num1);
        }
        else if(num2 > num3){
            System.out.println("El número mayor es "+num2);
            }
        else{
            System.out.println("El numero mayor es "+num3);
        }
    }
}
