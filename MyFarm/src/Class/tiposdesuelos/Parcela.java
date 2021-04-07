/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.tiposdesuelos;

import Jfrom.animales;
import Jfrom.grama;
import java.awt.event.ActionEvent;

/**
 *
 * @author dell
 */
public class Parcela extends Suelos {
     private int fila ;
     private int columna;        
    public Parcela(int posx, int posy, int ancho, int alto) {
        super(posx, posy, ancho, alto);
    }
     @Override
     public void posicion(int x,int y){
         this.fila=x;
         this.columna=y;
    //setText((x+1)+"-"+(y+1));
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        animales ani=new animales();
        ani.setVisible(true);
        ani.jLabel1.setText(String.valueOf(this.fila));
        ani.jLabel2.setText(String.valueOf(this.columna));
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
}
