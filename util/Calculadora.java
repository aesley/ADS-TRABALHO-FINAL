package util;

public class Calculadora {
	

	public double soma(double numeroA, double numeroB) { //Aesley
		return numeroA + numeroB;
	}
	
	public double subtracao(double numeroA, double numeroB) { //EDUARDO
		return numeroA - numeroB;
	}
	
	public double divisao(double numeroA, double numeroB) { //EDUARDO
		try
			{
			if (numeroA / numeroB < Double.MAX_VALUE)
		{
				return numeroA / numeroB;
		}
			else 
			{
				System.out.println("Divisão por zero");
				return -1;
			}
			}
			catch (Exception e1) 
			{
				System.out.println("Erro ao executar a divisão por zero");
				return 0;		
	}
	}
	
	public double multiplicacao(double numeroA, double numeroB) { //Aesley
		return numeroA * numeroB;
			}
	
	public double raiz(double numeroA) { //TIAGO
		if(numeroA < 0){
			System.out.println("Não existe raiz quadrada de número negativo no conjunto dos números reais");
			return 0;
		}
		return Math.sqrt(numeroA);
	}
	
	public double exponencial(double numeroA, double numeroB) { //TIAGO
		return Math.pow(numeroA, numeroB);
	}
	
	public double piso(double numeroA) { // BETO
		return Math.floor(numeroA);
	}
	
	public double teto(double numeroA) { //BETO
		return Math.ceil(numeroA);
	}
}
