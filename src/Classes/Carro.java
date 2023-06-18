/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Marcelo
 */
public class Carro {
    
    int id;
    int prioridad;
    int contador;
    String marca;
    int hp; // define la calidad del auto
    String localizador;
    
    public Carro(int id, int prioridad, String marca, int hp, String localizador){
        
        this.id = id;
        this.prioridad = prioridad;
        this.marca = marca;
        this.hp = hp;
        this.localizador = localizador;
        
    }
    
}
