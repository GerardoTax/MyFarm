/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.plantas;

import Class.Bodega;
import Class.Datos;
import Class.Granja;
import Jfrom.tablero;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
    private Datos datos;
    private Bodega bodega;
    private int fila;
    private int columna;
    private Granja granja;
    public Frutas(String nombre, int semillasPlantar, Bodega bodega , Datos datos, int fila ,int columna, Granja granja) {
        this.nombre=nombre;
        this.semillasPlantar=semillasPlantar;
        this.vidaFruto=5;
        this.bodega=bodega;
        this.datos=datos;
        this.fila=fila;
        this.columna=columna;
        this.granja=granja;
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
             this.sleep(20000);
             this.CanitidadManzanas=this.CanitidadManzanas+1;
             int resp = JOptionPane.showConfirmDialog( null, "Desea cosechar  Manzanas ?" , "Confirmación" , JOptionPane.YES_NO_OPTION ); 
            if( resp == JOptionPane.YES_OPTION ){
                this.bodega.sumarFruta(15);
                this.datos.sumarAlimentosGeneradoGranja(15);
            }
            
             
        }
        this.sleep(5000);
        JOptionPane.showMessageDialog(null,"El arbol de manzanda a muerto");
         Icon imag=new ImageIcon(getClass().getResource("/imagenes/arbol.jpg"));
         granja.getBotones()[this.fila][columna].setIcon(imag);
         tablero.jPanel1.updateUI();
        
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
