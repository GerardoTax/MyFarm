/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import Class.tiposdesuelos.Agua;
import Class.tiposdesuelos.Desierto;
import Class.tiposdesuelos.Grama;
import Class.tiposdesuelos.Parcela;
import Class.tiposdesuelos.Suelos;
import Enum.TiposSuelos;
import Jfrom.agua;
import Jfrom.tablero;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Granja {
    private int CANTIDAD_BOTONES=5;
    private Suelos [][] botones;
    public Granja(){
    
    botones=new Suelos[CANTIDAD_BOTONES][CANTIDAD_BOTONES];
    
    }
    public void botones(){
        for(int i=0;i<botones.length;i++){
            
            for(int j=0;j<botones.length;j++){
                int numeroAleatorio=(int) (Math.random()*100+1);
                 
                //botones[i][j]=new Boton(110*j,110*i,100,100);
                //botones[i][j].Camibiarnombre(i, j);
                if(numeroAleatorio<=40){
                    botones[i][j]=new Grama(110*j,110*i,100,100);
                    botones[i][j].posicion(i, j);
                    Icon imag=new ImageIcon(getClass().getResource("/imagenes/s1.jpg"));
                    botones[i][j].setIcon(imag); 
                    tablero.jPanel1.add(botones[i][j]);
                    botones[i][j].setEstado(TiposSuelos.GRAMA);
                  }
                
                else if(numeroAleatorio<=75 && numeroAleatorio>40 ){
                    botones[i][j]=new Agua(110*j,110*i,100,100);
                    botones[i][j].posicion(i, j);
                    Icon imag=new ImageIcon(getClass().getResource("/imagenes/s2.jpg"));
                    botones[i][j].setIcon(imag);
                    tablero.jPanel1.add(botones[i][j]);
                    botones[i][j].setEstado(TiposSuelos.AGUA); 
                }
                
                 else if(numeroAleatorio<=100 && numeroAleatorio>75 ){
                        botones[i][j]=new Desierto(110*j,110*i,100,100);
                        botones[i][j].posicion(i, j);
                        Icon imag=new ImageIcon(getClass().getResource("/imagenes/s3.jpg"));
                        botones[i][j].setIcon(imag); 
                        tablero.jPanel1.add(botones[i][j]);
                        botones[i][j].setEstado(TiposSuelos.DESIERTO);
                   }
            }
        
        }
    
    }

    public Suelos[][] getBotones() {
        return botones;
        
    }

    public void setBotones(Suelos[][] botones) {
        this.botones = botones;
    }


    public void comprarTierras(){
        this.CANTIDAD_BOTONES=this.CANTIDAD_BOTONES+1;
  
    }
    
   public void crearparcela(int fila, int columna){
       
       if(botones[fila][columna+1].getEstado()==botones[fila][columna].getEstado()){
            botones[fila][columna+1].setVisible(false );
            botones[fila][columna].setVisible(false );
            botones[fila][columna]=new Parcela(110*columna,110*fila,210,100);
            botones[fila][columna].posicion(fila, columna);
            tablero.jPanel1.add(botones[fila][columna]);
            Icon imag=new ImageIcon(getClass().getResource("/imagenes/parcela.jpg"));
            botones[fila][columna].setIcon(imag);
            
        }
       
       else {
           JOptionPane.showMessageDialog(null, "no se pudo realizar ");
       }
   }
   
    
    
}
