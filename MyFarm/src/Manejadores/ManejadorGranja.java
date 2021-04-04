/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;

import Class.Granja;
import Class.Granjero;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author dell
 */
public class ManejadorGranja extends Thread{
    private Granjero granjero;
    private Granja  granja;

    public ManejadorGranja(Granjero granjero1, Granja granja1) {
         this.granjero=granjero1;
        this.granja= granja1;
    }
   
    
    public void comprarBarcos(int fila ,int columna)  {
   
             if(granjero.getOro()>=500){
                 granjero.RestarOro(500);
                 Icon imagenBarco=new ImageIcon(getClass().getResource("/imagenes/pescando.jpg"));
                 granja.getBotones()[fila][columna].setIcon(imagenBarco);
               
                 
             }
             
             
    
    }
    
}
