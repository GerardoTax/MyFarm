/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Animales;

/**
 *
 * @author dell
 */
public class Animal {
    private String nombre;
    private int vida;
    private int carne;
    int tiempoVida;
    public Animal(String nombre, int vida,int carne,int tiempoVida){
        this.nombre=nombre;
        this.vida=vida;
        this.carne=carne;
        this.tiempoVida=tiempoVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getCarne() {
        return carne;
    }

    public int getTiempoVida() {
        return tiempoVida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }
     
    public void comer(int Cantidad){
     this.vida=this.vida+Cantidad;
    }
    public void ambre(){
        
    this.vida=this.vida-5;
    
    }
    public void muerteVejes(){
        
        if(this.tiempoVida==0){
            this.vida=0;
        }
    }
    
}
