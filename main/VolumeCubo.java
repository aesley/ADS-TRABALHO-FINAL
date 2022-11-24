package main;

import util.Calculadora;

public class VolumeCubo { //Tiago
    
    private double aresta;

    public double calVol(){
                
        Calculadora calc = new Calculadora();
        double vol = calc.exponencial(aresta,3);
             
        return vol;
        
    }

    public double getAresta(){
        return aresta;
    }

    public void setAresta(double aresta){
        this.aresta = aresta;
    }
   
}