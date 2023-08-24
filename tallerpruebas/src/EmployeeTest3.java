package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest3 {

//Calcular bono (trabajador) en dólares
	
	@Test
	void testCalculateYearBonus1() {
		assertEquals(386.0,Math.floor(new Employee(999.0f,"USD",0.2f,EmployeeType.Worker).CalculateYearBonus()));
	}
		
//Calcular bono (surpevisor) en dólares
		
	@Test
	void testCalculateYearBonus2() {
		assertEquals(593.0,Math.floor(new Employee(400.0f,"USD",0.2f,EmployeeType.Supervisor).CalculateYearBonus()));
	}
//Calcular bono (manager) en dólares
	
	@Test
	void testCalculateYearBonus3() {
		assertEquals(886.0,Math.floor(new Employee(500.0f,"USD",0.2f,EmployeeType.Manager).CalculateYearBonus()));
	}
	
//Calcular bono (EURO) en otra moneda
	
	@Test
	void testCalculateYearBonus4() {
		assertEquals(956.0,Math.floor(new Employee(600.0f,"EURO",0.2f,EmployeeType.Manager).CalculateYearBonus()));
	}




}
