package main;
import util.Calculadora;

public class Digitos {


	public static double NumDigitos(double numero) {
		
        Calculadora calc = new Calculadora();
		
        double res = calc.teto(Math.log10(numero+1));

		return res;
	}

}