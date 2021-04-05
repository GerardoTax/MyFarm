/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.tiposdesuelos;

import Jfrom.agua;
import java.awt.Color;
import java.awt.event.ActionEvent;

/**
 *
 * @author dell
 */
public class Agua extends Suelos {
    private int fila;
    private int columna;
    
    public Agua(int posx, int posy, int ancho, int alto) {
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
        agua agu =new agua();
        agu.jLabel3.setText(String.valueOf(fila));
        agua.jLabel4.setText(String.valueOf(columna));
        agu.setVisible(true);
        
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
}
