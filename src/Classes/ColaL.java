/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author mkferrerteran
 */
public class ColaL {

    private NodoL Inicio, Final;

    String cola = "";

    public ColaL() {
        this.Inicio = null;
        this.Final = null;
    }

    public boolean itsEmpty() {

        if (Inicio == null) {
            return true;
        } else {
            return false;
        }

    }

    public void insert(Carro data) {
        NodoL nodo = new NodoL();
        nodo.data = data;
        nodo.next = null;

        if (itsEmpty()) {
            Inicio = nodo;
            Final = nodo;
        } else {
            Final.next = nodo;
            Final = nodo;
        }

    }

    public Carro sacar() {
        if (!itsEmpty()) {
            Carro data = Inicio.data;
            if (Inicio == Final) {
                Inicio = null;
                Final = null;
            } else {
                Inicio = Inicio.next;
            }
            return data;
        } else {
            return null;
        }
    }
    
    public int size(ColaL cola){
        NodoL temp = cola.Inicio;
        int contador = 0;
        
        while(temp !=null){
            contador++;
            temp = temp.next;
        }
        return contador;
    }
    
    public String text(){
        NodoL nodo = this.Inicio;
        String text = "";
        
        while(nodo != null){
            
            Carro carro = nodo.data;
            
            text += "ID: " + carro.id + " Prioridad: " + carro.prioridad + " Marca: " + carro.marca + " Performance: " + carro.hp;
            
            nodo = nodo.next;
            
        }
        
        
        return text;
    }
    
 
}
