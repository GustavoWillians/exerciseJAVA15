package entities;

public class Retangle {
	
    public double largura , altura;

	public double area () {	
	       return (largura*altura) / 2;
	}
	
	public double perimetro() {
		   return 2 * (largura * altura);
	}
    public double diagonal() {
    	   return Math.sqrt(largura * largura + altura * altura);
    }
	
}
