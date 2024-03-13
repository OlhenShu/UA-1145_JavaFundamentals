package denys.serdiuk.homework4Arrays.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MonthMainTest {
	
	@BeforeEach
	void setUp() {
		System.out.println("Before each");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("After each");
	}
	
	@Test
	void testMonthLengt() {
		assertEquals(31, MonthMain.monthLength(1));
		assertEquals(28, MonthMain.monthLength(2));
		assertEquals(31, MonthMain.monthLength(3));
		assertEquals(30, MonthMain.monthLength(4));
		assertEquals(31, MonthMain.monthLength(5));
		assertEquals(30, MonthMain.monthLength(6));
		assertEquals(31, MonthMain.monthLength(7));
		assertEquals(30, MonthMain.monthLength(8));
		assertEquals(31, MonthMain.monthLength(9));
		assertEquals(30, MonthMain.monthLength(10));
		assertEquals(31, MonthMain.monthLength(11));
		assertEquals(30, MonthMain.monthLength(12));
		assertEquals(0, MonthMain.monthLength(-5));		
	}
}
