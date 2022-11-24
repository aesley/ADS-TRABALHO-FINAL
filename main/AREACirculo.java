package main;
import util.Calculadora;
import java.lang.Math. *;

public class AREACirculo { //Eduardo

	private double raio;
	

	public double calculaAreaCirculo() {
		Calculadora calc = new Calculadora();

		double raioAoQuadrado = calc.multiplicacao(raio, raio);
		double Area = calc.multiplicacao(raioAoQuadrado, Math.PI);
		return Area;
	}

	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}

