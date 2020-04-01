import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculationTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(7,Calculation.findMax(new int[]{7,3,4,2}));  
        assertEquals(7,Calculation.findMax(new int[]{7,3,7,2})); 
        assertEquals(9,Calculation.findMax(new int[]{7,3,7,9})); 
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    } 
	
	@Test  
    public void testCube(){  
        assertEquals(125,Calculation.cube(5));  
        assertEquals(-125,Calculation.cube(-5));  
        assertEquals(8,Calculation.cube(2));
        assertEquals(-8,Calculation.cube(-2));
    } 
	
	@Test  
    public void testReverseWord(){  
        assertEquals("aloH éuq lat",Calculation.reverseWord("Hola qué tal"));  
    } 

}
