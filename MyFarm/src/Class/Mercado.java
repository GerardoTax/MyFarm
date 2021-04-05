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
public class Mercado {
    private int  semillasGrano =200;
    private int  semillasFruta=100;
    private int hojasArbol = 2000;
    private int paja=2000;
    private int trigo=2000;
    private int abonoOrganico=1500;
    private int abonoVerde=1800;
    private int abonoCitrico=1200;
    private int insectos=500;
    private int consentrado= 800;
    private int sebada= 1750;
    private int vaca=10;
    private int gallinas=20;
    public Mercado(){
    
    }

    public int getSemillasGrano() {
        return semillasGrano;
    }

    public int getSemillasFruta() {
        return semillasFruta;
    }

    public int getHojasArbol() {
        return hojasArbol;
    }

    public int getPaja() {
        return paja;
    }

    public int getTrigo() {
        return trigo;
    }

    public int getAbonoOrganico() {
        return abonoOrganico;
    }

    public int getAbonoVerde() {
        return abonoVerde;
    }

    public int getAbonoCitrico() {
        return abonoCitrico;
    }

    public int getInsectos() {
        return insectos;
    }

    public int getConsentrado() {
        return consentrado;
    }

    public int getSebada() {
        return sebada;
    }

    public void sumarSemillasGrano(int cantidad){
        
        this.semillasGrano=this.semillasGrano+cantidad;
    }
    public void restarsemillasGrano(int cantidad){
        this.semillasGrano=this.semillasGrano-cantidad;
    
    }
    public void sumarSemillasFruta(int cantidad){
        this.semillasFruta=this.semillasFruta+cantidad;
    }
    
    public void restarSemillasFruta(int cantidad){
        this.semillasFruta=this.semillasFruta-cantidad;
    }

    public int getVaca() {
        return vaca;
    }

    public int getGallinas() {
        return gallinas;
    }
    
  
}
