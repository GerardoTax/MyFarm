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
public class Sembrar implements Mercado{
    
    public void iniciarSiembra(){
    int semillas=0;
        Granos granos=new Granos("",semillas);
        granos.cosecha();
    }

    @Override
    public int comprarsemillas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
