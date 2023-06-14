/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Marcelo
 */
public class IA {
    
    int bugaListos;
    int lamboListos;
    Cola ganadores = new Cola();
    
    public IA(){
        this.bugaListos = 0;
        this.lamboListos = 0;
    }

    public int getBugaListos() {
        return bugaListos;
    }

    public int getLamboListos() {
        return lamboListos;
    }
    
    public void recibirCarros(Carro buga, Carro Lambo, Cola B1, Cola B2, Cola B3, Cola L1, Cola L2, Cola L3, Cola BR, Cola LR) throws InterruptedException{
        
       double prob = Math.round((Math.random() * 10)) / 10.0;
       
       Thread.sleep(10000);
       
       if(prob <= 0.27){ // empate
           
           B1.insert(buga);
           L1.insert(Lambo);
           
           
       } else if( prob > 0.27 && prob <= 0.60){ // no se lleva a cabo
           
           BR.insert(buga);
           LR.insert(Lambo);
           
           
       } else{ // existe ganador
           
           if(buga.hp > Lambo.hp){
               ganadores.insert(buga);
           }else{
               ganadores.insert(Lambo);
           }
           
       }
        
    }
    
}
