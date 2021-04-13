
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Animales;

import Class.Bodega;
import Class.Datos;
import Interface.Omnivoros;
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

    public Gallina(String nombre, Bodega bodega, Datos datos) {
        super(nombre, 100, 100, 500);
        this.huevos=0;
        this.bodega=bodega;
        this.datos=datos;
        Thread hilo=new Thread(this,"hilo");
        hilo.start();
    }
    
    
    public void obtenerhuevos()throws InterruptedException{
       while(this.huevos != 64){
            Thread.sleep(10000);
            int resp = JOptionPane.showConfirmDialog( null, "Recoger huevos ?" , "Confirmación" , JOptionPane.YES_NO_OPTION ); 
            if( resp == JOptionPane.YES_OPTION ){
                this.huevos=this.huevos+4;
                bodega.setHuevo(this.huevos);
                datos.sumarAlimentosGeneradoGranja(4);
            }
       }
       JOptionPane.showConfirmDialog( null, "Gallinas fallecidas");
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
