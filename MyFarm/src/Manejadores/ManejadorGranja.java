/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;

import Class.Animales.Crianza;
import Class.Bodega;
import Class.Datos;
import Class.Granja;
import Class.Granjero;
import Class.Mercado;
import Class.plantas.Planta;
import Jfrom.bodega;
import Jfrom.tablero;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class ManejadorGranja extends Thread{
    private Granjero granjero;
    private Granja  granja;
    private Mercado mercado;
    private Bodega bode;
    private Datos dato;
    

    public ManejadorGranja(Granjero granjero1, Granja granja1, Mercado mercado, Bodega bodega, Datos dato) {
        this.granjero=granjero1;
        this.granja= granja1;
        this.mercado=mercado;
        this.bode=bodega;
        this.dato=dato;
    }
   
    public void comprarBarcos(int fila ,int columna){
        
                if(granjero.getOro()>=500){
                    granjero.RestarOro(500);
                    Icon imagenBarco=new ImageIcon(getClass().getResource("/imagenes/pescando.jpg"));
                    granja.getBotones()[fila][columna].setIcon(imagenBarco);   
                }
             
             else 
                 JOptionPane.showMessageDialog(null, "no tiene el  oro suficiente ");
            
    }
    
    public void sembrarFruta(int fila ,int columna){
        
        if(bode.getFrutas()>=10){
            bode.restarFruta(10);
            Planta planta=new Planta(granjero,granja);
            planta.sembrarFruta(bode.getFrutas(), fila, columna);  
            dato.sumarCeldasSembradas();
        }
        
        else if (granjero.getOro()>=45){
            int resp = JOptionPane.showConfirmDialog( null, "Quiere comprar semillas de fruta a 45?" , "Confirmación" , JOptionPane.YES_NO_OPTION ); 
            if( resp == JOptionPane.YES_OPTION ){
                 granjero.RestarOro(45);
                 dato.Sumarsemilas(10);
                 mercado.restarSemillasFruta(10);
                 Planta planta=new Planta(granjero,granja);
                 planta.sembrarFruta(bode.getFrutas(), fila, columna);
                 dato.sumarCeldasSembradas();
            }  
        }
        else JOptionPane.showMessageDialog(null, " oro insuficiente  ");
    }
    
    public void sembrarGranos(int fila, int columna){
        
        if(bode.getGranos()>=10){
            bode.restarGrano(10);
            Planta planta=new Planta(granjero,granja);
            planta.sembrarGranos(bode.getGranos(), fila, columna);
            dato.sumarCeldasSembradas();
       
        }
        else if (granjero.getOro()>=30){
            int resp = JOptionPane.showConfirmDialog( null, "Quiere comprar semillas de Grano a 30 ?" , "Confirmación" , JOptionPane.YES_NO_OPTION ); 
            if( resp == JOptionPane.YES_OPTION ){
                granjero.RestarOro(30);
                dato.Sumarsemilas(10);
                mercado.restarsemillasGrano(10);
                Planta planta=new Planta(granjero,granja);
                planta.sembrarGranos(bode.getGranos(), fila, columna);
                dato.sumarCeldasSembradas();
            }
        }
        else JOptionPane.showMessageDialog(null, "oro insuficiente  ");
        
    }
    public void crearparcela(int fila, int columna){
         int resp = JOptionPane.showConfirmDialog( null, "Quiere crear parcela ?" , "Confirmación" , JOptionPane.YES_NO_OPTION ); 
         if( resp == JOptionPane.YES_OPTION ){
              granja.crearparcela(fila, columna);
            }
    
    }
    
    public void criarVaca(int fila, int columna){
        if(granjero.getOro()>=500){
            granjero.RestarOro(500);
            dato.sumarVacas(2);
            Crianza cri=new Crianza(granjero, granja);
            cri.criarVaca(fila, columna);
        }
        else JOptionPane.showMessageDialog(null, "oro insuficiente  ");
    }
    
    public void criarGallina(int fila,int  columna){
        if(granjero.getOro()>=120){
            granjero.RestarOro(120);
            dato.sumarGallinas(4);
            Crianza cri=new Crianza(granjero, granja);
            cri.criarGallinas(fila, columna);
        }
        else JOptionPane.showMessageDialog(null, " oro insuficiente  ");
    }
    public void vidaGranjero() throws InterruptedException{
        while(granjero.getVida() !=0){
            granjero.restarVida(1);
            this.sleep(5000);
            tablero.jLabel7.setText(String.valueOf(granjero.getVida()));
        
        }
    }
    
    
    @Override
    public void run(){
        try{
            vidaGranjero();
        }catch(InterruptedException e){
            System.out.println("error al procesar");
            e.printStackTrace();
        }
        
    
    }
    
    
}
