/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Jfrom.tablero;

/**
 *
 * @author dell
 */
public class Cronometro extends  Thread {
    private int hora;
    private int minuto;
    private int segundo;
    
    
    public void iniciarCronometro() throws InterruptedException{
        for(hora=0; hora<60; hora++){
            for(minuto=0; minuto<60; minuto++){
                for(segundo=0;segundo<60; segundo++){
                    tablero.jLabel10.setText(hora+":"+minuto+":"+segundo);
                    this.sleep(1000);
                }
            
            }
        }
    
    
    
    }
     
    @Override
    public void run(){
        try{
            iniciarCronometro();
        }catch(InterruptedException e){
            System.out.println("error al procesar");
            e.printStackTrace();
        }
    }
    
}
