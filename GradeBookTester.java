import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester 
{
	//Two objects for GradeBook
	private GradeBook a1;
	private GradeBook b1;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		a1 = new GradeBook(5);

	    a1.addScore(60.0);

	    a1.addScore(85.0);
	    
	    b1 = new GradeBook(5);
	    
	    b1.addScore(43.0);
	    
	    b1.addScore(55.0);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		a1 = null;
		b1 = null;
	}

	@Test
	void testAddScore() 
	{
		 assertTrue(a1.toString().equals("60.0 85.0 "));
		 assertTrue(b1.toString().equals("43.0 55.0 "));
		 
		 assertEquals(2, a1.getScoreSize(), .001);
		 assertEquals(2, b1.getScoreSize(), .001);
	

	}

	@Test
	void testSum() 
	{
		assertEquals(145.0, a1.sum(), .0001);
		assertEquals(98.0, b1.sum(), .0001);

	}

	@Test
	void testMinimum() 
	{
		assertEquals(60.0, a1.minimum(), .001);
		assertEquals(43.0, b1.minimum(), .001);
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(85.0, a1.finalScore(), .0001);
		assertEquals(55.0, b1.finalScore(), .0001);
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
