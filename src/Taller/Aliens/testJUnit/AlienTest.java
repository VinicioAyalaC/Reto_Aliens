package Taller.Aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Taller.Aliens.Clases.Alien;

public class AlienTest {	

		// ---------- PARTE 3: Constructor y validaciones de tamaño ----------

		@Test
		void testTamanioDentroDelRango() {
			Alien alien = new Alien(15, "verde");
			assertEquals(15, alien.getTamanio());
		}

		@Test
		void testTamanioMenorAlMinimoSeAjusta() {
			Alien alien = new Alien(2, "rojo");
			assertEquals(5, alien.getTamanio());
		}

		@Test
		void testTamanioMayorAlMaximoSeAjusta() {
			Alien alien = new Alien(50, "azul");
			assertEquals(30, alien.getTamanio());
		}

		@Test
		void testTamanioEnLimiteMinimoExacto() {
			Alien alien = new Alien(5, "gris");
			assertEquals(5, alien.getTamanio());
		}

		@Test
		void testTamanioEnLimiteMaximoExacto() {
			Alien alien = new Alien(30, "gris");
			assertEquals(30, alien.getTamanio());
		}

		@Test
		void testColorAsignadoCorrectamente() {
			Alien alien = new Alien(10, "morado");
			assertEquals("morado", alien.getColor());
		}

		// ---------- PARTE 3: Cálculo de precios base ----------

		@Test
		void testPrecioCuerpoCalculadoCorrectamente() {
			Alien alien = new Alien(20, "verde");
			assertEquals(20 * 0.20, alien.getPrecioCuerpo(), 0.0001);
		}

		@Test
		void testPrecioExtremidadCalculadoCorrectamente() {
			Alien alien = new Alien(20, "verde");
			assertEquals(20 * 0.10, alien.getPrecioExtremidad(), 0.0001);
		}

		@Test
		void testPrecioOjoCalculadoCorrectamente() {
			Alien alien = new Alien(20, "verde");
			assertEquals(20 * 0.05, alien.getPrecioOjo(), 0.0001);
		}

		// ---------- PARTE 4: Valores iniciales ----------

		@Test
		void testValoresInicialesEnCero() {
			Alien alien = new Alien(10, "verde");
			assertEquals(0, alien.getNumeroOjos());
			assertEquals(0, alien.getNumeroBrazos());
			assertEquals(0, alien.getNumeroPies());
			assertEquals(0, alien.getPrecioTotal());
		}

		// ---------- PARTE 7: Extremidades ----------

		@Test
		void testAgregarBrazosCasoValido() {
			Alien alien = new Alien(10, "verde");
			assertTrue(alien.agregarBrazos(4));
			assertEquals(4, alien.getNumeroBrazos());
		}

		@Test
		void testAgregarBrazosExcedeLimite() {
			Alien alien = new Alien(10, "verde");
			assertFalse(alien.agregarBrazos(11));
			assertEquals(0, alien.getNumeroBrazos());
		}

		@Test
		void testAgregarBrazosEnLimiteExacto() {
			Alien alien = new Alien(10, "verde");
			assertTrue(alien.agregarBrazos(10));
			assertEquals(10, alien.getNumeroBrazos());
		}

		@Test
		void testAgregarPiernasCasoValido() {
			Alien alien = new Alien(10, "verde");
			assertTrue(alien.agregarPiernas(3));
			assertEquals(3, alien.getNumeroPies());
		}

		@Test
		void testAgregarPiernasExcedeLimite() {
			Alien alien = new Alien(10, "verde");
			assertFalse(alien.agregarPiernas(11));
			assertEquals(0, alien.getNumeroPies());
		}

		@Test
		void testAgregarBrazosYPiernasCombinadoDentroDelLimite() {
			Alien alien = new Alien(10, "verde");
			assertTrue(alien.agregarBrazos(5));
			assertTrue(alien.agregarPiernas(5));
			assertEquals(5, alien.getNumeroBrazos());
			assertEquals(5, alien.getNumeroPies());
		}

		@Test
		void testAgregarBrazosYPiernasCombinadoExcedeLimite() {
			Alien alien = new Alien(10, "verde");
			assertTrue(alien.agregarBrazos(6));
			assertFalse(alien.agregarPiernas(6)); // 6 + 6 = 12 > 10
			assertEquals(6, alien.getNumeroBrazos());
			assertEquals(0, alien.getNumeroPies());
		}

		// ---------- PARTE 8: Ojos ----------

		@Test
		void testAgregarOjosTamanioPequenio() {
			Alien alien = new Alien(8, "verde"); // 5-10 cm -> max 3
			assertTrue(alien.agregarOjos(3));
			assertFalse(alien.agregarOjos(1)); // excede
			assertEquals(3, alien.getNumeroOjos());
		}

		@Test
		void testAgregarOjosTamanioMedio() {
			Alien alien = new Alien(15, "verde"); // >10-20 cm -> max 5
			assertTrue(alien.agregarOjos(5));
			assertFalse(alien.agregarOjos(1));
			assertEquals(5, alien.getNumeroOjos());
		}

		@Test
		void testAgregarOjosTamanioGrande() {
			Alien alien = new Alien(25, "verde"); // >20-30 cm -> max 7
			assertTrue(alien.agregarOjos(7));
			assertFalse(alien.agregarOjos(1));
			assertEquals(7, alien.getNumeroOjos());
		}

		// ---------- PARTE 9: Precio total ----------

		@Test
		void testPrecioTotalInicialEsCero() {
			Alien alien = new Alien(10, "verde");
			assertEquals(0, alien.getPrecioTotal());
		}

		@Test
		void testPrecioTotalSeActualizaAlAgregarBrazos() {
			Alien alien = new Alien(10, "verde");
			alien.agregarBrazos(2);
			double esperado = alien.getPrecioCuerpo() + (2 * alien.getPrecioExtremidad());
			assertEquals(esperado, alien.getPrecioTotal(), 0.0001);
		}

		@Test
		void testPrecioTotalSeActualizaAlAgregarOjos() {
			Alien alien = new Alien(10, "verde");
			alien.agregarOjos(2);
			double esperado = alien.getPrecioCuerpo() + (2 * alien.getPrecioOjo());
			assertEquals(esperado, alien.getPrecioTotal(), 0.0001);
		}

		@Test
		void testPrecioTotalCompleto() {
			Alien alien = new Alien(20, "verde");
			alien.agregarBrazos(2);
			alien.agregarPiernas(2);
			alien.agregarOjos(3);
			double esperado = alien.getPrecioCuerpo()
					+ (4 * alien.getPrecioExtremidad())
					+ (3 * alien.getPrecioOjo());
			assertEquals(esperado, alien.getPrecioTotal(), 0.0001);
		}
	}

