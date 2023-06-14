package hn.uth.aplicacion_tarea1_areas_geometricas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Before
	public void configuracionInicial() {
		System.out.println("Método de tipo Setup, se ejecuta antes de cada prueba");
	}
	
	@Test
	public void testCirculo1() {
		assertEquals(App.circulo(3.1415,1.5), 7.0683, 0.0001);
	}
	
	@Test
	public void testCirculo2() {
		assertEquals(App.circulo(3.1415,-5.3), 88.2447, 0.0001);
	}
	
	@Test
	public void testCirculo3() {
		assertEquals(App.circulo(-3.1415,-3.0), 28.2735, 0.0001);
	}
	
	@Test
	public void testCuadrado1() {
		assertTrue(App.cuadrado(2.0,2.0) == 4.0);
	}
	
	@Test
	public void testCuadrado2() {
		assertEquals(App.cuadrado(-3.5,3.0), -10.5, 0.0001);
	}
	
	@Test
	public void testCuadrado3() {
		assertEquals(App.cuadrado(-4.2,8.2), -34.44, 0.0001);
	}
	
	@Test
	public void testRectangulo1() {
		assertTrue(App.rectangulo(1.0,1.0) == 1.0);
	}
	
	@Test
	public void testRectangulo2() {
		assertEquals(App.rectangulo(-3.5,2.3), -8.0499, 0.0001);
	}
	
	@Test
	public void testRectangulo3() {
		assertEquals(App.rectangulo(-6.8,-9.1), 61.8799, 0.0001);
	}
	
	@Test
	public void testTriangulo1() {
		assertTrue(App.triangulo(2.0,5.0) == 5.0);
	}
	
	@Test
	public void testTriangulo2() {
		assertEquals(App.triangulo(8.8,-1.0), -4.4, 0.0001);
	}
	
	@Test
	public void testTriangulo3() {
		assertEquals(App.triangulo(-2.4,-1.8), 2.16, 0.0001);
	}

	@After
	public void finalizacionPruebas() {
		System.out.println("Método de tipo TearDown, se ejecuta después de cada prueba");	
	}

 
}
