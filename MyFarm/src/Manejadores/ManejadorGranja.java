/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;

import Class.Bodega;
import Class.Granja;
import Class.Granjero;
import Class.Mercado;
import Class.plantas.Planta;
import Jfrom.bodega;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class ManejadorGranja extends Thread{
    private Granjero granjero;
    private Granja  granja;
    private Mercado mercado;
    private Bodega bode;

    public ManejadorGranja(Granjero granjero1, Granja granja1, Mercado mercado, Bodega bodega) {
        this.granjero=granjero1;
        this.granja= granja1;
        this.mercado=mercado;
        this.bode=bodega;
    }
   
    
    public void comprarBarcos(int fila ,int columna)  {
   
             if(granjero.getOro()>=500){
                 granjero.RestarOro(500);
                 Icon imagenBarco=new ImageIcon(getClass().getResource("/imagenes/pescando.jpg"));
                 granja.getBotones()[fila][columna].setIcon(imagenBarco);
               
                 
             }
             
             
             
    
    }
    public void sembrarFruta(int fila ,int columna){
        
        if(bode.getFrutas()>=10){
            bode.restarFruta(10);
            Planta planta=new Planta(granjero,granja);
            planta.sembrarFruta(bode.getFrutas(), fila, columna);
            
            
            
        }
        else if (granjero.getOro()>=45){
            int resp = JOptionPane.showConfirmDialog( null, "Quiere comprar semillas de fruta a 45?" , "Confirmación" , JOptionPane.YES_NO_OPTION ); 
            if( resp == JOptionPane.YES_OPTION ){
                 granjero.RestarOro(45);
                 mercado.restarSemillasFruta(10);
                 Planta planta=new Planta(granjero,granja);
                 planta.sembrarFruta(bode.getFrutas(), fila, columna);  
            
            }

           
        }
        
    
    }
    
    public void sembrarGranos(int fila, int columna){
        
        if(bode.getGranos()>=10){
            bode.restarGrano(10);
            Planta planta=new Planta(granjero,granja);
            planta.sembrarGranos(bode.getGranos(), fila, columna);            
       
        }
        else if (granjero.getOro()>=30){
            int resp = JOptionPane.showConfirmDialog( null, "Quiere comprar semillas de Grano a 30 ?" , "Confirmación" , JOptionPane.YES_NO_OPTION ); 
            if( resp == JOptionPane.YES_OPTION ){
                granjero.RestarOro(30);
                mercado.restarsemillasGrano(10);
                Planta planta=new Planta(granjero,granja);
                planta.sembrarGranos(bode.getGranos(), fila, columna);  
            }
        }
        
    }
    
}
