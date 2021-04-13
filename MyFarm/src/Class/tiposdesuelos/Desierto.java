/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.tiposdesuelos;

import java.awt.Color;
import java.awt.event.ActionEvent;

/**
 *
 * @author dell
 */
    //en esta clase no se inicializo otra clase 
public class Desierto extends Suelos{
    private int fila;
    private int columna;
    
    public Desierto(int posx, int posy, int ancho, int alto) {
        super(posx, posy, ancho, alto);
    }
    @Override
     public void posicion(int x,int y){
         this.fila=x;
         this.columna=y;
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.PINK);
        
    }
    
}
