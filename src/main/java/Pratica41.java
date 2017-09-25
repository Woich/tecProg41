
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woich
 */
public class Pratica41 {
    public static void main(String args[]){
        Elipse eli = new Elipse();
        
        eli.setEixoX(6.0);
        eli.setEixoY(5.0);
        
        System.out.println("Semi eixo X da Elipse: " + eli.getEixoX());
        System.out.println("Semi eixo Y da Elipse: " + eli.getEixoY());
        System.out.println("Area da Elipse: " + eli.getArea(eli.getEixoX(), eli.getEixoY()));
        System.out.println("Perimetro da Elipse: " + eli.getPerimetro(eli.getEixoX(), eli.getEixoY()));
        System.out.println();
        
        
        
        Circulo circ = new Circulo();
        
        circ.setRaio(3.0);
        
        System.out.println("Raio do Circulo: " + circ.getRaio());
        System.out.println("Area do Circulo: " + eli.getArea(circ.getRaio(), circ.getRaio()));
        System.out.println("Perimetro do Circulo: " + circ.getPerimetro(circ.getRaio()));
        System.out.println();
    }
}
