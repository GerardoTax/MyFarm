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
public class Granjero {
    //atributos 
    private String nombre;
    private String nick;
    private int vida;
    private double oro;
    
    public Granjero(String nombre ,String nick){
        this.nombre= nombre;
        this.nick=nick;
        this.vida=100;
        this.oro=2000;
       
    }
    //cada atributo tiene su metodo get y set
    public String getNombre() {
        return nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setOro(double oro) {
        this.oro = oro;
    }

    public int getVida() {
        return vida;
    }

    public double getOro() {
        return oro;
    }
    
     public void sumarOro(double oro){
         this.oro=this.oro+oro;
     }
     
     
     public void RestarOro(double oro){
         this.oro=this.oro-oro;
     }
     
     public void sumarVida(int vida){
         this.vida=this.vida+vida;
     }
     
     public void restarVida(int vida){
         this.vida=this.vida-vida;
     }
    
}
