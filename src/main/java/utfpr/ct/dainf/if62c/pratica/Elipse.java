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
public class Elipse {
    
    private double eixoX;
    private double eixoY;
    
    /**
     * @return the eixoX
     */
    public double getEixoX() {
        return eixoX/2;
    }

    /**
     * @param eixoX the eixoX to set
     */
    public void setEixoX(double eixoX) {
        this.eixoX = eixoX;
    }

    /**
     * @return the eixoY
     */
    public double getEixoY() {
        return eixoY/2;
    }

    /**
     * @param eixoY the eixoY to set
     */
    public void setEixoY(double eixoY) {
        this.eixoY = eixoY;
    }
    
    public double getArea(double semiX, double semiY){
        double resultado;
        
        resultado = Math.PI * semiX * semiY;
        
        return resultado;
    }
    
    public double getPerimetro(double semiX, double semiY){
        double resultado;
        
        resultado = Math.PI *(  3*(semiX + semiY)  -  Math.sqrt( (3*semiX + semiY)  *  (semiX + 3*semiY) ) );
        
        return resultado;
    }
}
