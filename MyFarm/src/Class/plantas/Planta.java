/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.plantas;

import Class.Bodega;
import Class.Datos;
import Class.Granja;
import Class.Granjero;
import Class.plantas.Frutas;
import Class.plantas.Granos;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Planta {
    private int semillasFruta;
    private int semillasGranos=50;
    private Granjero granjero;
    private Granja granja;
    private Bodega bodega;
    private Datos dato;
   
    
    public Planta(Granjero granjero, Granja granja, Bodega bodega, Datos dato) {
        
        this.granjero=granjero;
        this.granja=granja;
        this.bodega=bodega;
        this.dato=dato;
   
   
    }
    
    public void sembrarFruta(int semillas,int fila, int columna){
       
            Frutas fruta=new Frutas("Manzana",semillas,bodega,dato, fila ,columna,granja);
            Icon imagenBarco=new ImageIcon(getClass().getResource("/imagenes/gramaFruto.jpg"));
            granja.getBotones()[fila][columna].setIcon(imagenBarco);
            Thread hilo =new Thread(fruta);
                   hilo.start();
             
           
            
         
    }
    
    public void sembrarGranos(int semillas, int fila, int columna){
        
            Granos grano=new Granos("Maiz",semillasGranos,bodega,dato,granja, fila,columna);
            Icon imagenBarco=new ImageIcon(getClass().getResource("/imagenes/gramaGrano.jpg"));
            granja.getBotones()[fila][columna].setIcon(imagenBarco);
            Thread hilo =new Thread(grano);
                   hilo.start();
            
        
        
    }

    public int getSemillasFruta() {
        return semillasFruta;
    }

    public int getSemillasGranos() {
        return semillasGranos;
    }

    public void setSemillasFruta(int semillasFruta) {
        this.semillasFruta = semillasFruta;
    }

    public void setSemillasGranos(int semillasGranos) {
        this.semillasGranos = semillasGranos;
    }
    
    
    
}
