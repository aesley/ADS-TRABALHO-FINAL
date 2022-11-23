package main;
import util.Calculadora;

public class PERIMETROQuadrado { //Aesley

    private double lado;
		
	public double calculaPerimetro(){
		Calculadora calc = new Calculadora();
		
		double numeroB = 4;
		double perimetro = calc.multiplicacao(lado, numeroB);
        
		return perimetro;
	}
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
}