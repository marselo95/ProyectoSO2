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
 * @author mkferrerteran
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

    int contadorB, contadorL;

    public CPU() throws InterruptedException, IOException {
        admin = new Admin();
        ia = new IA();
        interfaz interfaz = new interfaz();

        this.contadorCiclos = 0;

        int p = new Random().nextInt(3) + 1;
        Carro carroL = null;
        Carro carroB = null;

        boolean activo = true;

        while (activo) {
            admin.actCola(admin.nivel3B, admin.nivel2B); //El administrador ejecuta la funcion de actualizar colas
            admin.actCola(admin.nivel2B, admin.nivel1B);
            admin.actCola(admin.nivel3L, admin.nivel2L);
            admin.actCola(admin.nivel2L, admin.nivel1L);
            admin.actRefuerzo();

            cola1B = admin.BL1(); //Obtiene la lista de prioridad en un String
            cola2B = admin.BL2();
            cola3B = admin.BL3();
            colaRB = admin.refuerzoB();

            cola1L = admin.LL1();
            cola2L = admin.nivel2L.text();
            cola3L = admin.LL3();
            colaRL = admin.refuerzoL();

            interfaz.P1B.setText(cola1B);
            interfaz.P2B.setText(cola2B);
            interfaz.P3B.setText(cola3B);
            interfaz.RefuerzoB.setText(colaRB);

            interfaz.P1L.setText(cola1L);
            interfaz.P2L.setText(cola2L);
            interfaz.P3L.setText(cola3L);
            interfaz.RefuerzoL.setText(colaRL);

            if (carroL != null && carroB != null) {
                // System.out.println("ID:" + carroL.id + " Prioridad:" + carroL.prioridad + " Marca: " + carroL.marca + " hp: "+ carroL.hp + " Localizador: "+ carroL.localizador);
                // System.out.println(admin.LL1());
                //System.out.println("ID:" + carroB.id + " Prioridad:" + carroB.prioridad + " Marca: " + carroB.marca + " hp: "+ carroB.hp + " Localizador: "+ carroB.localizador);
                interfaz.circuitB.setText("ID: " + carroB.id + " Prioridad: " + carroB.prioridad + " Marca: " + carroB.marca + " Performance: " + carroB.hp);
                interfaz.circuitL.setText("ID: " + carroL.id + " Prioridad: " + carroL.prioridad + " Marca: " + carroL.marca + " Performance: " + carroL.hp);
                interfaz.state.setText("Corriendo");
                String state = ia.recibirCarros(carroB, carroL, admin.nivel1B, admin.nivel2B, admin.nivel3B, admin.nivel1L, admin.nivel2L, admin.nivel3L, admin.refuerzoB, admin.refuerzoL, admin.ganadores);

                interfaz.state.setText(state);
                Thread.sleep(1000);
                interfaz.circuitB.setText("");
                interfaz.circuitL.setText("");
                interfaz.timeL.setText("");
                interfaz.timeB.setText("");
                interfaz.state.setText("waiting");

            }

            cola1B = admin.BL1(); //Obtiene la lista de prioridad en un String
            cola2B = admin.BL2();
            cola3B = admin.BL3();
            colaRB = admin.refuerzoB();

            cola1L = admin.LL1();
            cola2L = admin.LL2();
            cola3L = admin.LL3();
            colaRL = admin.refuerzoL();

            interfaz.P1B.setText(cola1B);
            interfaz.P2B.setText(cola2B);
            interfaz.P3B.setText(cola3B);
            interfaz.RefuerzoB.setText(colaRB);

            interfaz.P1L.setText(cola1L);
            interfaz.P2L.setText(cola2L);
            interfaz.P3L.setText(cola3L);
            interfaz.RefuerzoL.setText(colaRL);

            if (contadorCiclos == 2) {
                contadorCiclos = 0;
                System.out.println("Agregando");
                admin.insertarB();
                admin.insertarL();
                Thread.sleep(1000);

            }

            cola1B = admin.BL1(); //Obtiene la lista de prioridad en un String
            cola2B = admin.BL2();
            cola3B = admin.BL3();
            colaRB = admin.refuerzoB();

            cola1L = admin.LL1();
            cola2L = admin.LL2();
            cola3L = admin.LL3();
            colaRL = admin.refuerzoL();

            interfaz.P1B.setText(cola1B);
            interfaz.P2B.setText(cola2B);
            interfaz.P3B.setText(cola3B);
            interfaz.RefuerzoB.setText(colaRB);

            interfaz.P1L.setText(cola1L);
            interfaz.P2L.setText(cola2L);
            interfaz.P3L.setText(cola3L);
            interfaz.RefuerzoL.setText(colaRL);

            Thread.sleep(1000);

            carroL = admin.sigL();
            carroB = admin.sigB();
            contadorCiclos++;

            Nodo nodo = admin.ganadores.getInicio();

            contadorB = contadorL = 0;

            while (nodo != null) {
                Carro carro = nodo.data;
                if (carro.marca == "Bugatti") {
                    contadorB++;
                } else {
                    contadorL++;
                }
                nodo = nodo.next;

            }

            interfaz.PuntajeB.setText(String.valueOf(contadorB));
            interfaz.PuntajeL.setText(String.valueOf(contadorL));
            interfaz.winners.setText(admin.ganadores.text());

        }

    }

}
