/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.plantas;

import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Frutas extends Thread  {
    private String  nombre;
    private int semillasPlantar ;
    private int CanitidadManzanas;
    private int vidaFruto;
    
    public Frutas(String nombre, int semillasPlantar) {
        this.nombre=nombre;
        this.semillasPlantar=semillasPlantar;
        this.vidaFruto=5;
       
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemillasPlantar() {
        return semillasPlantar;
    }

    public int getCanitidadManzanas() {
        return CanitidadManzanas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaFruto() {
        return vidaFruto;
    }
    
    public void setSemillasPlantar(int semillasPlantar) {
        this.semillasPlantar = semillasPlantar;
    }

    public void setCanitidadManzanas(int CanitidadManzanas) {
        this.CanitidadManzanas = CanitidadManzanas;
    }
    
    public void cosechar() throws InterruptedException{
        while(this.CanitidadManzanas !=5){
             this.sleep(2000);
             this.CanitidadManzanas=this.CanitidadManzanas+1;
            JOptionPane.showMessageDialog(null,this.CanitidadManzanas);
            
             
        }
        JOptionPane.showMessageDialog(null,"se murio");
        
    }
    
    
    
    
    @Override
    public void run(){
        try{
            
           cosechar();
           
        }catch(InterruptedException e){
            System.out.println("error al procesar");
            e.printStackTrace();
        }
    }
}
