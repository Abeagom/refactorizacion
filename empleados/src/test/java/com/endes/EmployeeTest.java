package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	Employee e = new Employee ("John", 5);
	
	@Test
	@DisplayName("Prueba del método getName")
	void testGetName() {
		String resultadoEsperado = "John";
		assertEquals(resultadoEsperado, e.getName(), "Los nombres no coinciden");
	}
	
	@Test
	@DisplayName("Prueba del método GetYears")
	void testGetYears() {
		int añosEsperados=5;
		assertEquals(añosEsperados, e.getEmployeeYears(), "Los años no coinciden");
	}
	
	@Test
	@DisplayName("Prueba del método setName")
	void testSetName() {
		String nombreEsperado="Jason";
		e.setName("Jason");
		assertEquals(nombreEsperado, e.getName(), "El nombre no coincide");
	}
	
	@Test
	@DisplayName("Prueba del método setYears")
	void testSetYears() {
		int añosEsperados=9;
		e.setEmployeeYears(9);
		assertEquals(añosEsperados, e.getEmployeeYears(), "Los años no coinciden");
	}

	@Test
	@DisplayName("Prueba del constructor")
	void testConstructor() {
		Employee e2 = new Employee("Jason", 9);
		String nombreEsperado = "Jason";
		int añosEsperados=9;
		assertEquals(nombreEsperado, e2.getName(), "El nombre no coincide");
		assertEquals(añosEsperados, e2.getEmployeeYears(), "Los años no coinciden");
	}
	
	@Test
	@DisplayName("Prueba del método toString")
	void testToString() {
		String resultadoEsperado = "[Name=John, EmployeeYears=5]";
		assertEquals(resultadoEsperado, e.toString(), "La cadena no coincide");
	}

}
