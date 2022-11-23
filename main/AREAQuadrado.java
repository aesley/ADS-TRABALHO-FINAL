package main;
import util.Calculadora;

public class AREAQuadrado { //Aesley

	private double lado;

	public double calculaArea() {
		Calculadora calc = new Calculadora();

		double Area = calc.multiplicacao(lado, lado);
		return Area;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
}

