import java.time.LocalDateTime;

public class TimeUtils {
	
//	@autowire
//	private LocalDateTime time;
//	
//	public LocalDateTime getTime() {
//		return time;
//	}
//
//	public void setTime(LocalDateTime time) {
//		this.time = time;
//	}

	public static String GetTimeOfDay(LocalDateTime time)
	{
	    if (time.getHour() >= 0 && time.getHour() < 6)
	    {
	        return "Night";
	    }
	    if (time.getHour() >= 6 && time.getHour() < 12)
	    {
	        return "Morning";
	    }
	    if (time.getHour() >= 12 && time.getHour() < 18)
	    {
	        return "Afternoon";
	    }
	    return "Evening";
	}
}

