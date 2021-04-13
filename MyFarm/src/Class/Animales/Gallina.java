
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Animales;

import Class.Bodega;
import Class.Datos;
import Interface.Omnivoros;
import Jfrom.animales;
import Jfrom.bodega;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Gallina extends Animal implements Omnivoros, Runnable{
    private int huevos;
    private  Bodega bodega;
    private  Datos datos;
    private int vida;

    public Gallina(String nombre, Bodega bodega, Datos datos) {
        super(nombre, 100, 100, 500);
        this.huevos=0;
        this.bodega=bodega;
        this.datos=datos;
        this.vida=100;
        Thread hilo=new Thread(this,"hilo");
        hilo.start();
    }
    
    
    public void obtenerhuevos()throws InterruptedException{
       while(this.vida != 0 ){
            Thread.sleep(10000);
           
            int resp = JOptionPane.showConfirmDialog( null, "Recoger huevos ?" , "Confirmación" , JOptionPane.YES_NO_OPTION ); 
            if( resp == JOptionPane.YES_OPTION ){
                this.vida=this.vida-20;
                this.huevos=this.huevos+4;
                bodega.setHuevo(this.huevos);
                datos.sumarAlimentosGeneradoGranja(4);
                if(animales.jComboBox1.getSelectedItem().equals("Gallina")){
                    this.vida=0;
                }
                
            }
       }
       Thread.sleep(2000);
       JOptionPane.showMessageDialog(null, "La gallina a muerto");
    }
    @Override
    public void comerConsentrado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comerSebada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int comerInsecto(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

    @Override
    public void run() {
        try{
            
           obtenerhuevos();
           
        }catch(InterruptedException e){
            System.out.println("error al procesar");
            e.printStackTrace();
        }
    }

   
    
}
