/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author dell
 */
public class Bodega {
    private int frutas=30;
    private int granos;
    private int piezaCuero;
    private int carne;
    private int Huevo=12;
    public Bodega(){
    
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
    public void sumarGrano(int cantidad){
        this.granos=this.granos+cantidad;
    }
    public void sumarCarne(int cantidad){
        this.carne=this.carne+cantidad;
    }
    
}
