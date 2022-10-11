package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle retangle = new Retangle();
		
		System.out.println("Insira a largura do triangulo:");
		retangle.largura = sc.nextDouble();
		System.out.println("Insira a altura do triangulo:");
		retangle.altura = sc.nextDouble();
		
		System.out.printf("A area do triangulo é:  %.2f%n", retangle.area());
		System.out.printf("O perimetro do triangulo é: %.2f%n", retangle.perimetro());
		System.out.printf("A diagonal do triangulo é: %.2f%n", retangle.diagonal());
		
	}

}
