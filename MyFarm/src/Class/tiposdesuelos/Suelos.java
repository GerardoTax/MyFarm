/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.tiposdesuelos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import static javax.swing.text.StyleConstants.setBackground;

public class Suelos  extends JButton  implements ActionListener {
    
    public Suelos(int posx, int posy ,int ancho  ,int alto   ){
    super.setBounds(posx, posy, ancho, alto);
    addActionListener(this);
    
    }
    public void Camibiarnombre(int x,int y){
    setText((x+1)+"-"+(y+1));
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.PINK);
        
    }
    
    
}
