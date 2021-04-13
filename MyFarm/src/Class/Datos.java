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
public class Datos {
    //atributos
    private int tiempoPartida;
    private int OroGeneradoGranja;
    private int alimentosGeneradoGranja;
    private int alimentosConsumidos;
    private int cantidadCeldasCompradas;
    private int cantidadCriasCompradasVaca;
    private int cantidadCriasCompradasGallina;
    private int cantidadDestacevaca;
    private int cantidadDestaceGallinas;
    private int cantidadSemillas;
    private int cantidadSembrado;
    public Datos(){
    
    }
    //cada abributo tiene su metodo get y set
    public int getTiempoPartida() {
        return tiempoPartida;
    }

    public int getOroGeneradoGranja() {
        return OroGeneradoGranja;
    }

    public int getAlimentosGeneradoGranja() {
        return alimentosGeneradoGranja;
    }

    public int getAlimentosConsumidos() {
        return alimentosConsumidos;
    }

    public int getCantidadCeldasCompradas() {
        return cantidadCeldasCompradas;
    }

    public int getCantidadCriasCompradasVaca() {
        return cantidadCriasCompradasVaca;
    }

    public int getCantidadDestacevaca() {
        return cantidadDestacevaca;
    }

    public int getCantidadDestaceGallinas() {
        return cantidadDestaceGallinas;
    }

    public int getCantidadSemillas() {
        return cantidadSemillas;
    }

    public int getCantidadSembrado() {
        return cantidadSembrado;
    }
    public void Sumarsemilas(int cantidad){
        this.cantidadSemillas=this.cantidadSemillas+cantidad;
    }
    public void sumarVacas(int cantidad){
        this.cantidadCriasCompradasVaca=this.cantidadCriasCompradasVaca+cantidad;
    }

    public int getCantidadCriasCompradasGallina() {
        return cantidadCriasCompradasGallina;
    }
    
    public void sumarGallinas(int cantidad){
        this.cantidadCriasCompradasGallina=this.cantidadCriasCompradasGallina+cantidad;
    }
    
    //metodo sumar y restar para cada aributo
    public void sumarCeldasSembradas(){
        this.cantidadSembrado++;
    }
    public void sumarCeldasCompradas(int cantidad){
        this.cantidadCeldasCompradas=this.cantidadCeldasCompradas+cantidad;
    }
    
    public void sumarAlimentosGeneradoGranja(int cantidad){
    this.alimentosGeneradoGranja=this.alimentosGeneradoGranja+cantidad;
    }
    
    public void sumarOroVenta(int cantidad){
        this.OroGeneradoGranja=this.OroGeneradoGranja+cantidad;
    }
    
    public void alimetosConsumido(int cantidad){
        this.alimentosConsumidos=this.alimentosConsumidos+cantidad;
    }
    
    public void sumardestaceVaca(int cantidad){
        this.cantidadDestacevaca=this.cantidadDestacevaca+cantidad;
    } 
    
    public void sumardestaceGallina(int cantidad){
        this.cantidadDestaceGallinas=this.cantidadDestaceGallinas+cantidad;
    }
}
