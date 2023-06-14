/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoso2;

import java.util.Random;

/**
 *
 * @author Marcelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double carroceria = 0;
        double chasis = 0;
        double motor = 0;
        double ruedas = 0;
        double calidad = 0;

        carroceria = Math.round((Math.random() * 10)) / 10.0;
        chasis = Math.round((Math.random() * 10)) / 10.0;
        motor = Math.round((Math.random() * 10)) / 10.0;
        ruedas = Math.round((Math.random() * 10)) / 10.0;
        
        calidad = (carroceria + chasis + motor + ruedas) /4;
        
        calidad = Math.round(calidad *10) /10.0;
        
        System.out.println(calidad);
        
        
    }
    
}
