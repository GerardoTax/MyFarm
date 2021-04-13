/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.tiposdesuelos;

import Enum.TiposSuelos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import static javax.swing.text.StyleConstants.setBackground;

    // la clase suelos hereda de la clase Jbutton esta clase es como la clase object 
public class Suelos  extends JButton  implements ActionListener {
    private TiposSuelos estado;
    
    public Suelos(int posx, int posy ,int ancho  ,int alto   ){
    super.setBounds(posx, posy, ancho, alto);
    addActionListener(this);
    
    }
    public void posicion(int x,int y){
    setText((x+1)+"-"+(y+1));
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.PINK);
        
    }

    public TiposSuelos getEstado() {
        return estado;
    }

    public void setEstado(TiposSuelos estado) {
        this.estado = estado;
    }
    
    
}
