/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Marcelo
 */
public class Cola {

    private Nodo Inicio, Final;

    String cola = "";

    public Cola() {
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
        Nodo nodo = new Nodo();
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
    
    public int size(Cola cola){
        Nodo temp = cola.Inicio;
        int contador = 0;
        
        while(temp !=null){
            contador++;
            temp = temp.next;
        }
        return contador;
    }

}
