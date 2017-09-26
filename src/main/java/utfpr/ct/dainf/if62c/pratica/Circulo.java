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
    
    public Circulo(){}
    
    public Circulo(double raio){
        this.eixoX=raio;
        this.eixoY=raio;
    }

    
    /**
     * @Override
     */
    public double getPerimetro(){
        double resultado;
        
        resultado = 2 * Math.PI * this.eixoX;
        
        return resultado;
    }
    
}