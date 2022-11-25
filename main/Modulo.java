package main;
import util.Calculadora;

public class Modulo {


	public static double GetModulo(double numerador, double denominador) {
		
        Calculadora calc = new Calculadora();
		double res = numerador - (denominador*calc.piso(numerador/denominador));
		return res;
	}

}