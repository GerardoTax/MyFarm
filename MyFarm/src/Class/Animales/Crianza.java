/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Animales;

import Class.Granja;
import Class.Granjero;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author dell
 */
public class Crianza {
    private Granjero granjero;
    private Granja granja;
    
    public  Crianza(Granjero granjero, Granja granja){
        this.granjero=granjero;
        this.granja=granja;
    }
    
    
    
    public void criarVaca(int fila , int columna){
      
        Vaca vaca=new Vaca("Vaca", 100, 75,10, 25,100);
        Icon imagenVaca=new ImageIcon(getClass().getResource("/imagenes/parcelavaca.jpg"));
        granja.getBotones()[fila][columna].setIcon(imagenVaca);
    }
    public void criarGallinas(int fila , int columna){
      
        Gallina gallina=new Gallina("Gallina");
        Icon imagenGallina=new ImageIcon(getClass().getResource("/imagenes/parcelaGallinas.jpg"));
        granja.getBotones()[fila][columna].setIcon(imagenGallina);
    }
}
