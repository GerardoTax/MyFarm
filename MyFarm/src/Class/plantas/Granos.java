/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.plantas;

import Class.Bodega;
import Class.Datos;
import Jfrom.bodega;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Granos extends Thread{
    private String nombres;
    private int semillnasPlantar;
    private int cosechaGranos;
    private  Bodega bodega;
    private Datos dato;
    public Granos(String nombre, int semillasPlantar,Bodega bodega, Datos dato){
        this.bodega=bodega;
        this.dato=dato;
    
    }

    public String getNombres() {
        return nombres;
    }

    public int getSemillnasPlantar() {
        return semillnasPlantar;
    }

    public int getCosechaGranos() {
        return cosechaGranos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setSemillnasPlantar(int semillnasPlantar) {
        this.semillnasPlantar = semillnasPlantar;
    }

    public void setCosechaGranos(int cosechaGranos) {
        this.cosechaGranos = cosechaGranos;
    }
    
    public void cosechar() throws InterruptedException{
        this.sleep(10000);
        int resp = JOptionPane.showConfirmDialog( null, "Desea cosechar  Maiz ?" , "Confirmación" , JOptionPane.YES_NO_OPTION ); 
            if( resp == JOptionPane.YES_OPTION ){
                this.bodega.sumarGrano(15);
                this.dato.sumarAlimentosGeneradoGranja(15);
            }
            else if (resp==JOptionPane.NO_OPTION){
                    this.bodega.sumarGrano(0);
            }
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
