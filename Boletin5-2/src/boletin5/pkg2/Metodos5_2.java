/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg2;

/**
 *
 * @author dfernandezguerreiro
 */
public class Metodos5_2 {
    private short num1, num2;
    
    public void verConta(short num1, short num2){
        if(num1 >= num2){
            System.out.println("num1-num2= "+(num1-num2));
        }
        else{
            System.out.println("num1+num2= "+(num1+num2));
        }
        
    }
}
