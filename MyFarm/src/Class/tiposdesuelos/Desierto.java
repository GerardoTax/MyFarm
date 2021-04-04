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
public class Desierto extends Suelos{
    
    public Desierto(int posx, int posy, int ancho, int alto) {
        super(posx, posy, ancho, alto);
    }
    @Override
     public void Camibiarnombre(int x,int y){
    setText((x+1)+"-"+(y+1));
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.PINK);
        
    }
    
}
