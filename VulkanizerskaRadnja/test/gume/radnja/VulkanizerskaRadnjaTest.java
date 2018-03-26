package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;
 
public class VulkanizerskaRadnjaTest {

	private VulkanizerskaRadnja v;
	private AutoGuma a;

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();		
		a = new AutoGuma();
		
		a.setMarkaModel("Tigar");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
	}

	@After
	public void tearDown() throws Exception {
		v= null;
		a= null;
	}

	@Test
	public void testDodajGumu() {
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(21);
		a2.setSirina(160);
		a2.setVisina(55);
		v.dodajGumu(a2);
		v.dodajGumu(a);
		assertEquals(a,v.pronadjiGumu("Tigar").getFirst());
	}
	
	@Test
	public void testDodajGumuEmpty() {
		v.dodajGumu(a);
		assertEquals(a,v.pronadjiGumu("Tigar").getFirst());
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuContains() {
		v.dodajGumu(a);
		v.dodajGumu(a);
	}

	
	
	
	
	@Test
	public void testPronadjiGumu() {
		LinkedList<AutoGuma> ls = new LinkedList<AutoGuma>();
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(21);
		a2.setSirina(160);
		a2.setVisina(55);
		
		ls.addFirst(a);
		ls.addFirst(a2);
		v.dodajGumu(a);
		v.dodajGumu(a2);
		
		assertEquals(ls, v.pronadjiGumu("Tigar"));
	}
	
	@Test
	public void testPronadjiGumuNull() {
		v.dodajGumu(a);
		assertEquals(null,v.pronadjiGumu(null));
	}
	
	@Test
	public void testPronadjiGumuEmpty() {
		v.dodajGumu(a);
		assertTrue(v.pronadjiGumu("Michelin").isEmpty());
	}
	
	@Test
	public void testPronadjiGumuEmpty2() {
		AutoGuma a2 = new AutoGuma();
		v.dodajGumu(a2);
		assertTrue(v.pronadjiGumu("Michelin").isEmpty());
	}

}
