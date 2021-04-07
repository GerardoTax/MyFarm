/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Animales;

import Interface.Herbivoro;

/**
 *
 * @author dell
 */
public class Vaca extends Animal implements Herbivoro{
   
    private int cuero;
    private int leche;

    public Vaca(String nombre, int vida, int carne,int tiempoVida, int cuero,int lehe) {
        super(nombre, vida,carne,tiempoVida);
        this.cuero=cuero;
        this.leche=leche;
    }
    
    @Override
    public void comerHojaArbol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comerPaja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comerTrigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
