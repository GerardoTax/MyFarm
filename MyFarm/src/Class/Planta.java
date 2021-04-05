/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Class.plantas.Frutas;
import Class.plantas.Granos;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author dell
 */
public class Planta {
    private int semillasFruta=50;
    private int semillasGranos=50;
    private Granjero granjero;
    private Granja granja;
   
    
    public Planta(Granjero granjero, Granja granja){
        
        this.granjero=granjero;
        this.granja=granja;
   
   
    }
    
    public void sembrarFruta(int semillas,int fila, int columna){
        int semillasFruta=semillas;
        if(semillasFruta>10){
            Frutas fruta=new Frutas("Manzana",semillasFruta);
            Icon imagenBarco=new ImageIcon(getClass().getResource("/imagenes/gramaFruto.jpg"));
            granja.getBotones()[fila][columna].setIcon(imagenBarco);
                 
        }
        else {
        // mercado
        }   
    }
    
    public void sembrarGranos(int semillas, int fila, int columna){
        int semillasGranos=semillas;
        if(semillasGranos>=10){
            Granos grano=new Granos("Maiz",semillasGranos);
            Icon imagenBarco=new ImageIcon(getClass().getResource("/imagenes/gramaGrano.jpg"));
            granja.getBotones()[fila][columna].setIcon(imagenBarco);
        }
        else {
         //mercado
        }
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
