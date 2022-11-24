package main;

import util.Calculadora;

public class AreaTriangEquil {
    
    private double lado;

    public double calAreaTriEq(){

        Calculadora calc = new Calculadora();

        double area = (calc.exponencial(lado, 2))*(calc.raiz(3))/4;

        return area;
    }

    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
}