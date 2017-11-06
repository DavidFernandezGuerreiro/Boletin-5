/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg4;

/**
 *
 * @author dfernandezguerreiro
 */
public class Metodos5_4 {
    float num1, num2;
    private String Pepe, Manuel;
    
    public void verPeso(float num1, float num2){
        if(num1 > num2){
            System.out.println("Pepe pesa = "+num1+"\n Diferencia de peso = "+(num1-num2));
        }
        else{
            System.out.println("Manuel pesa = "+num2+"\n Diferencia de peso = "+(num2-num1));
        }
    }
}
