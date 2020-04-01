import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//
//public class FakeLocalDateTimeProvider implements ILocalDateTimeProvider
//{
//    private localDateTime; 
//    
//    public FakeDateTimeProvider(LocalDateTime time) { this.localDateTime = time }
//    // public FakeDateTimeProvider() { this.localDateTime = new LocalDateTime(2015, 12, 31, 23, 59, 59) } 
//    
//    public LocalDateTime dameUsuarios() { return  }
//}
//
//
class TimeUtilsTest {

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
		// Restaurar la hora
	}

	@Test
	void testALas0DevuelveNight() {
		
		LocalDateTime timeOfDay = LocalDateTime.of(2020, java.time.Month.APRIL, 1, 0, 0);
		//mock, fake, dummy, stub
		
		// TimeUtils.setTime(timeOfDay);
		
		String salida = TimeUtils.GetTimeOfDay(timeOfDay);
		assertEquals("Night", salida);
	}
	
	@Test
	void testALas6DevuelveMorning() {
		LocalDateTime timeOfDay = LocalDateTime.of(2020, java.time.Month.APRIL, 1, 6, 0);
		
		String salida = TimeUtils.GetTimeOfDay(timeOfDay);
		assertEquals("Morning", salida);
	}
//	
//	@Test
//	void testALas6DevuelveMorning() {
//		
//		ILocalDateTimeProvider localDateTimeProvider = new FakeLocalDateTimeProvider();
//		// SmartHomeController controller = new SmartHomeController(localDateTimeInstance)
//				
//		SmartHomeController controller = new SmartHomeController();
//		controller.setLocalDateTimeInstance(localDateTimeProvider);
//		
//		controller.ActuateLights(true);
//		
//		assertEquals("Morning", salida);
//	}

}





