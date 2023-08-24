package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Rule;


class EmployeeTest {

	@Test
	void testCs1() {
		assertEquals(500.0,Math.floor(new Employee(500.0f,"USD",0.3f,EmployeeType.Worker).cs()));
	}
	
	@Test
	void testCs2() {
		assertEquals(701.0,Math.floor(new Employee(700.0f,"USD",5.0f,EmployeeType.Supervisor).cs()));
	}
	
	@Test
	void testCs3() {
		assertEquals(805.0,Math.floor(new Employee(800.0f,"USD",8.0f,EmployeeType.Manager).cs()));
	}
	
	@Test
	void testCs4() {
		assertEquals(475.0,Math.floor(new Employee(500.0f,"EURO",0.3f,EmployeeType.Worker).cs()));
	}

	@Test
	void testCalculateYearBonus1() {
		assertEquals(386.0,Math.floor(new Employee(999.0f,"USD",0.2f,EmployeeType.Worker).CalculateYearBonus()));
	}
	
	@Test
	void testCalculateYearBonus2() {
		assertEquals(593.0,Math.floor(new Employee(400.0f,"USD",0.2f,EmployeeType.Supervisor).CalculateYearBonus()));
	}
	
	@Test
	void testCalculateYearBonus3() {
		assertEquals(886.0,Math.floor(new Employee(500.0f,"USD",0.2f,EmployeeType.Manager).CalculateYearBonus()));
	}
	
	@Test
	void testCalculateYearBonus4() {
		assertEquals(956.0,Math.floor(new Employee(600.0f,"EURO",0.2f,EmployeeType.Manager).CalculateYearBonus()));
	}

}
