/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Jfrom.bodega;

/**
 *
 * @author dell
 */
public class Bodega {
    private int frutas=30;
    private int granos;
    private int piezaCuero;
    private int carne;
    private int Huevo;
    private Granjero granjero;
    private Datos datos;
    private Mercado mercado;
    
    public Bodega(Granjero granjero, Datos datos, Mercado mercado){
        this.granjero=granjero;
        this.datos=datos;
        this.mercado=mercado;
        
    }

    public int getFrutas() {
        return frutas;
    }

    public int getGranos() {
        return granos;
    }

    public int getPiezaCuero() {
        return piezaCuero;
    }

    public int getCarne() {
        return carne;
    }

    public int getHuevo() {
        return Huevo;
    }

    public void setFrutas(int frutas) {
        this.frutas = frutas;
    }

    public void setGranos(int granos) {
        this.granos = granos;
    }

    public void setPiezaCuero(int piezaCuero) {
        this.piezaCuero = piezaCuero;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public void setHuevo(int Huevo) {
        this.Huevo = Huevo;
    }
    
    public void restarFruta(int cantidad){
        
        this.frutas=this.frutas-cantidad;
    }
     public void sumarFruta(int cantidad){
         this.frutas=this.frutas+cantidad;
     }
     public void restarGrano(int cantidad){
         this.granos=this.granos-cantidad;
     }
     public void restarCarne(int cantidad){
         this.carne=this.carne-cantidad;
     }
     public void restarHuevo(int cantidad){
         this.Huevo=this.Huevo-cantidad;
     }
     
    public void sumarGrano(int cantidad){
        this.granos=this.granos+cantidad;
    }
    public void sumarCarne(int cantidad){
        this.carne=this.carne+cantidad;
    }
    public void sumarHuevos(int cantidad){
        this.Huevo=this.Huevo+cantidad;
    }
    public void consumirAlimentos(){
        if(granjero.getVida()<90 ){
            if(bodega.jComboBox1.getSelectedItem().equals("Frutos") && this.frutas>10){
                granjero.sumarVida(10);
                this.restarFruta(10);
                datos.alimetosConsumido(10);
            }
            else if(bodega.jComboBox1.getSelectedItem().equals("Granos") && this.granos>7){
                granjero.sumarVida(7);
                this.restarGrano(7);
                datos.alimetosConsumido(7);
            }
             else if(bodega.jComboBox1.getSelectedItem().equals("Carne") && this.carne>10){
                granjero.sumarVida(15);
                this.restarCarne(10);
                datos.alimetosConsumido(10);
            }
             
            else if(bodega.jComboBox1.getSelectedItem().equals("Huevos") && this.Huevo>5){
                granjero.sumarVida(5);
                this.restarHuevo(5);
                datos.alimetosConsumido(5);
            }
           
        }
    }
    public void vender(){
        if(bodega.jComboBox2.getSelectedItem().equals("Frutos") && this.frutas>10){
                granjero.sumarOro(90);
                this.restarFruta(10);
                datos.sumarOroVenta(90);
                mercado.sumarFrutos(10);
                
            }
            else if(bodega.jComboBox2.getSelectedItem().equals("Granos") && this.granos>7){
                granjero.sumarOro(60);
                this.restarGrano(7);
                datos.sumarOroVenta(60);
                mercado.sumarGranos(7);
            }
             else if(bodega.jComboBox2.getSelectedItem().equals("Carne") && this.carne>10){
                granjero.sumarOro(100);
                this.restarCarne(10);
                datos.sumarOroVenta(100);
            }
             
            else if(bodega.jComboBox2.getSelectedItem().equals("Huevos") && this.Huevo>5){
                granjero.sumarOro(25);
                this.restarHuevo(5);
                datos.sumarOroVenta(100);
            }
    
    }
    
}
