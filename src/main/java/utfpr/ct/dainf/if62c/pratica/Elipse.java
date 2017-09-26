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
    
    protected double eixoX;
    protected double eixoY;
    
    public Elipse(){}
    
    public Elipse(double eiX, double eiY){
        this.eixoX = eiX;
        this.eixoY = eiY;
    }
    
    public double getArea(){
        double resultado;
        
        resultado = Math.PI * this.eixoX * this.eixoY;
        
        return resultado;
    }
    
    public double getPerimetro(){
        double resultado;
        
        resultado = Math.PI *(  3*(this.eixoX + this.eixoY)  -  Math.sqrt((3*this.eixoX + this.eixoY)  *  (this.eixoX + 3* this.eixoY) ) );
        
        return resultado;
    }
}
