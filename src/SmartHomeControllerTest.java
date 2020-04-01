import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

interface BackyardLightSwitcherInterface {
	public static boolean methodTurnOnHasBeenCalled = false;
	public static void TurnOn() {};
	public static void TurnOff() {};
}

class SmartHomeControllerTest {
	
	static class BackyardLightSwitcher implements BackyardLightSwitcherInterface {
		
		// private static boolean isOn = false;
		
		public static boolean methodTurnOnHasBeenCalled = false;
		
		public static void TurnOn() {
			BackyardLightSwitcher.methodTurnOnHasBeenCalled = true;
			// BackyardLightSwitcher.isOn = true;
		}
		
		public static void TurnOff() {
			// BackyardLightSwitcher.isOn = false;
		}
		
//		public static boolean lightIsOn() {
//			// return BackyardLightSwitcher.isOn;
//		}
	}

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
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void actuateLightsCuandoSeDetectaMovimientoYEsEveningSeEnciende() {
		LocalDateTime fakeTime = LocalDateTime.of(2020, java.time.Month.APRIL, 1, 19, 0);
		BackyardLightSwitcherInterface fakeSwitcher = new SmartHomeControllerTest.BackyardLightSwitcher();
		
		SmartHomeController c = new SmartHomeController();
		c.setTime(fakeTime);
		c.setSwitcher(fakeSwitcher);
		
		c.actuateLights(true);
		
		assertTrue(fakeSwitcher.methodTurnOnHasBeenCalled);
	}
	
	@Test
	void actuateLightsCuandoSeDetectaMovimientoYEsEveningSeEnciende_ConMockito() {
		LocalDateTime fakeTime = mock(LocalDateTime.class);
		when(fakeTime.getHour()).thenReturn(19);
	    
		LocalDateTime fakeSwitcher = mock(BackyardLightSwitcher.class);
		
		SmartHomeController c = new SmartHomeController();
		c.setTime(fakeTime);
		c.setSwitcher(fakeSwitcher);
		
		c.actuateLights(true);
		
		verify(fakeSwitcher).TurnOn();
	}

}
