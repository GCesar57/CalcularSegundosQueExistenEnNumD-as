package com.ejercicio11;

import java.util.Scanner;

public class CalcularSegundosQueExistenEnNumDías {

	public static void main(String[] args) {
		//Escribe un algoritmo que calcule e imprima los segundos que existen en el
		//número de días ingresados por el usuario.
		Scanner entrada = new Scanner(System.in);
		double dias, segundos;
		System.out.println("Ingrese los días:");
		dias = entrada.nextDouble();
		//
		segundos = dias * 24 * 60 * 60;
		System.out.println("Los dias " + dias);
		System.out.println("Son equivalentes a " + segundos + "segundos.");
	}

}
