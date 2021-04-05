/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.plantas;

/**
 *
 * @author dell
 */
public class Frutas  {
    private String  nombre;
    private int semillasPlantar ;
    private int CanitidadManzanas;
    
    public Frutas(String nombre, int semillasPlantar) {
        this.nombre=nombre;
        this.semillasPlantar=semillasPlantar;
       
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemillasPlantar() {
        return semillasPlantar;
    }

    public int getCanitidadManzanas() {
        return CanitidadManzanas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSemillasPlantar(int semillasPlantar) {
        this.semillasPlantar = semillasPlantar;
    }

    public void setCanitidadManzanas(int CanitidadManzanas) {
        this.CanitidadManzanas = CanitidadManzanas;
    }
    
   
     
}
