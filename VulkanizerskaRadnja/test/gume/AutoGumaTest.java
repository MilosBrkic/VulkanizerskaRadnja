
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AutoGumaTest {

	private AutoGuma a;
	
	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}
	
	@After
	public void tearDown() throws Exception {
		a = null;
	}


	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Tigar");
		assertEquals("Tigar", a.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelShort() {
		a.setMarkaModel("Ti");
	}
	



	@Test
	public void testSetPrecnik() {
		a.setPrecnik(20);
		assertEquals(20, a.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikSmall() {
		a.setPrecnik(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikBig() {
		a.setPrecnik(40);
	}

	

	@Test
	public void testSetSirina() {
		a.setSirina(200);
		assertEquals(200,a.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaSmall() {
		a.setSirina(100);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaBig() {
		a.setSirina(500);
	}


	
	@Test
	public void testSetVisina() {
		a.setVisina(50);
		assertEquals(50,a.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaSmall() {
		a.setVisina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaBig() {
		a.setVisina(100);
	}

	

	@Test
	public void testToString() {
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(40);
		assertEquals("AutoGuma [markaModel=Michelin, precnik=20, sirina=200, visina=40]",a.toString());
	}


	
	@Test
	public void testEqualsObjectTrue() {
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(40);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Michelin");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(40);
		
		assertTrue(a.equals(a2));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(40);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(40);
		
		assertFalse(a.equals(a2));
	}

}
