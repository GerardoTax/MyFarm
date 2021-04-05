/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.tiposdesuelos;

import Class.tiposdesuelos.Suelos;
import Jfrom.grama;
import java.awt.Color;
import java.awt.event.ActionEvent;

/**
 *
 * @author dell
 */
public class Grama extends Suelos{
    private int fila;
    private int columna;
    public Grama(int posx, int posy, int ancho, int alto) {
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
        grama gra=new grama();
        gra.setVisible(true);
        gra.jLabel4.setText(String.valueOf(this.fila));
        gra.jLabel5.setText(String.valueOf(this.columna));
  
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
}
