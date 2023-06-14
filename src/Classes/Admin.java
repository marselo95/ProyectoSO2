/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Random;

/**
 *
 * @author Marcelo
 */
public class Admin {

    int idL;
    int idB;

    Cola nivel1L;
    Cola nivel2L;
    Cola nivel3L;

    Cola nivel1B;
    Cola nivel2B;
    Cola nivel3B;

    Cola refuerzoL;
    Cola refuerzoB;
    
    Cola ganadores;

    public Admin() {
        idL = 0;
        idB = 0;

        nivel1B = new Cola();
        nivel2B = new Cola();
        nivel3B = new Cola();

        nivel1L = new Cola();
        nivel2L = new Cola();
        nivel3L = new Cola();

        refuerzoB = new Cola();
        refuerzoL = new Cola();
        
        ganadores = new Cola();
        
        
    }

    public int getIdL() {
        return idL;
    }

    public int getIdB() {
        return idB;
    }

    public Cola getNivel1L() {
        return nivel1L;
    }

    public Cola getNivel2L() {
        return nivel2L;
    }

    public Cola getNivel3L() {
        return nivel3L;
    }

    public Cola getNivel1B() {
        return nivel1B;
    }

    public Cola getNivel2B() {
        return nivel2B;
    }

    public Cola getNivel3B() {
        return nivel3B;
    }

    public Cola getRefuerzoL() {
        return refuerzoL;
    }

    public Cola getRefuerzoB() {
        return refuerzoB;
    }

    public double calidadL() {
        double carroceria = 0;
        double chasis = 0;
        double motor = 0;
        double ruedas = 0;
        double calidad = 0;

        carroceria = Math.round((Math.random() * 10)) / 10.0;
        chasis = Math.round((Math.random() * 10)) / 10.0;
        motor = Math.round((Math.random() * 10)) / 10.0;
        ruedas = Math.round((Math.random() * 10)) / 10.0;

        calidad = (carroceria + chasis + motor + ruedas) / 4;

        calidad = Math.round(calidad * 10) / 10.0;

        return calidad;
    }

    public double calidadB() {
        double carroceria = 0;
        double chasis = 0;
        double motor = 0;
        double ruedas = 0;
        double calidad = 0;

        carroceria = Math.round((Math.random() * 10)) / 10.0;
        chasis = Math.round((Math.random() * 10)) / 10.0;
        motor = Math.round((Math.random() * 10)) / 10.0;
        ruedas = Math.round((Math.random() * 10)) / 10.0;

        calidad = (carroceria + chasis + motor + ruedas) / 4;

        calidad = Math.round(calidad * 10) / 10.0;

        return calidad;
    }

    public int prioridad() {
        double calidad = calidadL();
        int prioridad;

        if (calidad >= 0.8) {
            prioridad = 1;
        } else if (0.4 <= calidad && calidad < 0.8) {
            prioridad = 2;
        } else {
            prioridad = 3;
        }

        return prioridad;
    }

    public void insertarL() {
        this.idL++;
        int prioridad = prioridad();
        int hp = new Random().nextInt(800-300)+300;
        Carro lambo = new Carro(this.idL, prioridad, "Lamborghini", hp, "Lambo");
        System.out.println("HP lambo: " + hp);
        switch (lambo.prioridad) {
            case 1:
                nivel1L.insert(lambo);
                break;
            case 2:
                nivel2L.insert(lambo);
                break;
            case 3:
                nivel3L.insert(lambo);
                break;
            default:
                System.out.println("Error insertar L");
                break;
        }
    }

    public void insertarB() {
        this.idB++;
        int prioridad = prioridad();
         int hp = new Random().nextInt(800-300)+300;
          System.out.println("HP Buga: " + hp);
        Carro buga = new Carro(this.idB, prioridad, "Bugatti", hp, "Buga");

        switch (buga.prioridad) {
            case 1:
                nivel1B.insert(buga);
                break;
            case 2:
                nivel2B.insert(buga);
                break;
            case 3:
                nivel3B.insert(buga);
                break;
            default:
                System.out.println("Error insertar B");
                break;
        }
    }

    public void actCola(Cola A, Cola B) {
        if (!A.itsEmpty()) {
            for (int i = 0; i < A.size(A); i++) {
                Carro temp = A.sacar();
                temp.contador++;

                if (temp.contador == 8) {
                    temp.contador = 0;
                    temp.prioridad--;
                    B.insert(temp);
                } else {
                    A.insert(temp);
                }

            }

        }
    }

    public void actRefuerzo() {
        if (!refuerzoB.itsEmpty() && !refuerzoL.itsEmpty()) {

            double prob = Math.round((Math.random() * 10)) / 10.0;

            if (prob <= 0.4) {

                boolean activo = true;

                while (activo) {
                    Carro Buga = refuerzoB.sacar();
                    Carro Lambo = refuerzoL.sacar();

                    if (Buga.localizador == "Buga" && Lambo.localizador == "Lambo") {
                        activo = false;

                        nivel1B.insert(Buga);
                        nivel1L.insert(Lambo);

                    }

                }
            }

        }
    }

    public Carro sigB() {
        if (!nivel1B.itsEmpty()) {
            Carro Buga = nivel1B.sacar();
            return Buga;
        } else if (!nivel2B.itsEmpty()) {
            Carro Buga = nivel2B.sacar();
            return Buga;
        } else if (!nivel3B.itsEmpty()) {
            Carro Buga = nivel3B.sacar();
            return Buga;
        } else {
            return null;
        }
    }

    public Carro sigL() {
        if (!nivel1L.itsEmpty()) {
            Carro Lambo = nivel1L.sacar();
            return Lambo;
        } else if (!nivel2L.itsEmpty()) {
            Carro Lambo = nivel2L.sacar();
            return Lambo;
        } else if (!nivel3L.itsEmpty()) {
            Carro Lambo = nivel3L.sacar();
            return Lambo;
        } else {
            return null;
        }
    }
    
    public String BL1(){
        String text = nivel1B.text();
        return text;
    }
    
    public String BL2(){
        String text = nivel2B.text();
        return text;
    }
    
    public String BL3(){
        String text = nivel3B.text();
        return text;
    }
    
    public String LL1(){
        String text = nivel1L.text();
        return text;
    }
    
    public String LL2(){
        String text = nivel2L.text();
        return text;
    }
    
    public String LL3(){
        String text = nivel3L.text();
        return text;
    }
    
    public String refuerzoL(){
        String text = refuerzoL.text();
        return text;
    }
    
    public String refuerzoB(){
        String text = refuerzoB.text();
        return text;
    }

}
