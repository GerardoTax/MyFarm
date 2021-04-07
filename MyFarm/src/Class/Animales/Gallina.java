/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Animales;

import Interface.Omnivoros;

/**
 *
 * @author dell
 */
public class Gallina extends Animal implements Omnivoros{
    private int huevos;

    public Gallina(String nombre) {
        super(nombre, 100, 100, 500);
        this.huevos=100;
    }
    
    

    @Override
    public void comerConsentrado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comersebada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int comerInsecto(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
