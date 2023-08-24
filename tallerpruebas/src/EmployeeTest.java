package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Rule;


class EmployeeTest {

//Calcular salario (trabajador) en dólares
	
	@Test
	void testCs1() {
		assertEquals(500.0,Math.floor(new Employee(500.0f,"USD",0.3f,EmployeeType.Worker).cs()));
	}
	
//Calcular salario (surpevisor) en dólares
	
	@Test
	void testCs2() {
		assertEquals(701.0,Math.floor(new Employee(700.0f,"USD",5.0f,EmployeeType.Supervisor).cs()));
	}
	
//Calcular salario (manager) en dólares
	@Test
	void testCs3() {
		assertEquals(805.0,Math.floor(new Employee(800.0f,"USD",8.0f,EmployeeType.Manager).cs()));
	}

//Calcular salario (EURO) en otra moneda
	@Test
	void testCs4() {
		assertEquals(475.0,Math.floor(new Employee(500.0f,"EURO",0.3f,EmployeeType.Worker).cs()));
	}

}
