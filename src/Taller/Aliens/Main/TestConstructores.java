package Taller.Aliens.Main;

import Taller.Aliens.Clases.Alien;

public class TestConstructores {

	public static void main(String[] args) {
		
		
		// prueba 1: tamaño entre 5 y 30
		System.out.println("---  TEST 1: ENTRE 5 & 30 ---");
		Alien alien1 = new Alien(15, "verde" );
		alien1.imprimir();
		
		System.out.println("---  TEST 2: MENOR AL MINIMO ---");
		Alien alien2 = new Alien(4, "rojo" );
		alien2.imprimir();
		
		System.out.println("---  TEST 3: MAYOR AL MAXIMO ---");
		Alien alien3 = new Alien(38, "azul" );
		alien3.imprimir();	
		
		
	}// main

}// class
