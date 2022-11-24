package main;
import util.Calculadora;
import java.lang.Math. *;

public class PERIMETROCirculo { //Eduardo

	private double raio;
	

	public double calcularPerimetroCirculo() {
		Calculadora calc = new Calculadora();

		double CumprimentoCirculo = calc.multiplicacao(raio, 2*Math.PI);
		return CumprimentoCirculo;
	}

	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}

