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
		
		
		
		// prueba 2:  agregar Extremidades
		System.out.println("---  TEST 4: MAYOR AL MAXIMO ---");
		Alien alien4 = new Alien(55, "negro" );
			boolean brazos = alien4.agregarBrazos(5);
			boolean piernas = alien4.agregarPiernas(6);
			boolean ojos = alien4.agregarOjos(2);
			System.out.println("Los brazos se agregaron correctamente?  :  "+brazos);
			System.out.println("Las piernas se agregaron correctamente? :  "+piernas);
			System.out.println("Los ojos se agregaron correctamente?    :  "+ojos);
			alien4.imprimir();	
		
		
		
	}// main

}// class
