/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Random;
import proyectoso2.interfaz;

/**
 *
 * @author Marcelo
 */
public class IA {

    int bugaListos;
    int lamboListos;
    int contadorCarreras;
    public static int time = 10;

    public IA() {
        this.bugaListos = 0;
        this.lamboListos = 0;
        this.contadorCarreras = 0;
    }

    public int getBugaListos() {
        return bugaListos;
    }

    public int getLamboListos() {
        return lamboListos;
    }

    public String recibirCarros(Carro buga, Carro Lambo, Cola B1, Cola B2, Cola B3, Cola L1, Cola L2, Cola L3, Cola BR, Cola LR, Cola ganadores) throws InterruptedException {

        double prob = Math.round((Math.random() * 10)) / 10.0;

        String state;

        int n = 0;
        
        contadorCarreras++;
        interfaz.contCarreras.setText(String.valueOf(contadorCarreras));

        Thread.sleep(time * 1000);
        

        if (prob <= 0.27) { // empate

            B1.insert(buga);
            L1.insert(Lambo);
            System.out.println("Empate");
            state = "Empate";

            Random rand = new Random();

            int seg = rand.nextInt(59);

            int mili = rand.nextInt(999);

            String time = "1:" + String.format("%02d", seg) + ":" + String.format("%03d", mili);

            interfaz.timeB.setText(time);
            interfaz.timeL.setText(time);

        } else if (prob > 0.27 && prob <= 0.60) { // no se lleva a cabo

            BR.insert(buga);
            LR.insert(Lambo);
            System.out.println("No hay carrera");
            state = "No hay carrera";

        } else { // existe ganador

            if (buga.hp > Lambo.hp) {
                ganadores.insert(buga);
                state = "Gana: " + buga.marca;
                Random rand = new Random();

                int seg = rand.nextInt(59);
                int seg2 = rand.nextInt(59);

                int mili = rand.nextInt(999);
                int mili2 = rand.nextInt(999);

                String time = "1:" + String.format("%02d", seg) + ":" + String.format("%03d", mili);

                String time2 = "2:" + String.format("%02d", seg2) + ":" + String.format("%03d", mili2);

                interfaz.timeB.setText(time);
                interfaz.timeL.setText(time2);
            } else {
                ganadores.insert(Lambo);
                state = "Gana: " + Lambo.marca;
                Random rand = new Random();
                int seg = rand.nextInt(59);
                int seg2 = rand.nextInt(59);
                int mili = rand.nextInt(999);
                int mili2 = rand.nextInt(999);
                String time = "1:" + String.format("%02d", seg) + ":" + String.format("%03d", mili);

                String time2 = "2:" + String.format("%02d", seg2) + ":" + String.format("%03d", mili2);

                interfaz.timeB.setText(time2);
                interfaz.timeL.setText(time);
            }
            System.out.println("Hay ganador");

        }
        return state;

    }

}
