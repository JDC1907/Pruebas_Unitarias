package src;
import java.util.Date;
import java.time.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class EmployeeTest2 {

	//Calcular mes impar
	
	@Test
	void testCs() {
		assertEquals(564.0,Math.floor(new Employee(500.0f,"USD",0.3f,EmployeeType.Worker).cs()));
	}

}
