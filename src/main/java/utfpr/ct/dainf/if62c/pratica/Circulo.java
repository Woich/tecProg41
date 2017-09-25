/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author woich
 */
public class Circulo extends Elipse {
    
    private double raio;
    
    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }
    /**
    * @Override
    */
    
    
    public double getPerimetro(double raio){
        double resultado;
        
        resultado = 2 * Math.PI * raio;
        
        return resultado;
    }
    
}
