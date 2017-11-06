/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg3;

/**
 *
 * @author dfernandezguerreiro
 */
public class Metodos5_3 {
    private int num;
    
    public void mostrarSimbolos(int num){
        if (num > 0){
            System.out.println("+");
        }
        else if(num < 0){
            System.out.println("-");
            }
            else{
                System.out.println("0");
            }
    }
}
