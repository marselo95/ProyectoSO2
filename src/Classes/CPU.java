/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.IOException;
import java.util.Random;
import proyectoso2.interfaz;

/**
 *
 * @author Marcelo
 */
public class CPU {
    
    int contadorCiclos; // contara cuando pasen 2 ciclos
    
    String cola1L;
    String cola2L;
    String cola3L;
    String colaRL;
    String cola1B;
    String cola2B;
    String cola3B;
    String colaRB;
    Admin admin;
    IA ia;
    
    public CPU() throws InterruptedException, IOException{ 
        admin = new Admin();
        ia = new IA();
        interfaz interfaz = new interfaz();
        
        this.contadorCiclos = 0;
        
        int p = new Random().nextInt(3)+1;
        Carro carroL = null;
        Carro carroB = null;
        
        boolean activo = true;
        
        while(activo){
            admin.actCola(admin.nivel3B ,admin.nivel2B); //El administrador ejecuta la funcion de actualizar colas
            admin.actCola(admin.nivel2B ,admin.nivel1B);
            admin.actCola(admin.nivel3L ,admin.nivel2L);
            admin.actCola(admin.nivel2L ,admin.nivel1L);
            admin.actRefuerzo();
            
            cola1B = admin.BL1(); //Obtiene la lista de prioridad en un String
            cola2B = admin.BL2();
            cola3B = admin.BL3();
            colaRB = admin.refuerzoB();
            
            cola1L = admin.LL1();
            cola2L = admin.LL2();
            cola3L = admin.LL3();
            colaRL = admin.refuerzoL();
            
            //interfaz.P1Bug.setText(cola1B);
            //interfaz.P2Bug.setText(cola2B);
            //interfaz.P3Bug.setText(cola3B);
            //interfaz.RefuerzoB.setText(colaRB);
            
            //interfaz.P1Lam.setText(cola1L);
            //interfaz.P2Lam.setText(cola2L);
            //interfaz.P3Lam.setText(cola3L);
            //interfaz.RefuerzoL.setText(colaRL);
            
            
            if (carroL != null && carroB != null){
                System.out.println("ID:" + carroL.id + " Prioridad:" + carroL.prioridad + " Marca: " + carroL.marca + " hp: "+ carroL.hp + " Localizador: "+ carroL.localizador);
                System.out.println(admin.LL1());
                System.out.println("ID:" + carroB.id + " Prioridad:" + carroB.prioridad + " Marca: " + carroB.marca + " hp: "+ carroB.hp + " Localizador: "+ carroB.localizador);
                //ia.recibirCarros(carro, carro, admin.BL1, admin.BL2, admin.BL3, admin.LL1, admin.LL2, admin.LL3, admin.refuerzoB, admin.refuerzoL, admin.ganadores);
            }
            
            //cola1B = admin.BL1(); //Obtiene la lista de prioridad en un String
            //cola2B = admin.BL2();
            //cola3B = admin.BL3();
            //colaRB = admin.refuerzoB();
            
            //cola1L = admin.LL1();
            //cola2L = admin.LL2();
            //cola3L = admin.LL3();
            //colaRL = admin.refuerzoL();
            
            //interfaz.P1Bug.setText(cola1B);
            //interfaz.P2Bug.setText(cola2B);
            //interfaz.P3Bug.setText(cola3B);
            //interfaz.RefuerzoB.setText(colaRB);
            
            //interfaz.P1Lam.setText(cola1L);
            //interfaz.P2Lam.setText(cola2L);
            //interfaz.P3Lam.setText(cola3L);
            //interfaz.RefuerzoL.setText(colaRL);
            
            if (contadorCiclos == 2){
                contadorCiclos = 0;
                System.out.println("Agregando");
                admin.insertarB();
                admin.insertarL();
                Thread.sleep(1000);
                    
            }
            
            Thread.sleep(1000);
            
            carroL = admin.sigL();
            carroB = admin.sigB();
            contadorCiclos++;
            
            
        }
        
        
    }
    

    
    
}
