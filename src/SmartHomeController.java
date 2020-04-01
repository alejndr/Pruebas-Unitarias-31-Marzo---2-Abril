import java.time.LocalDateTime;

public class SmartHomeController
{
	@autowire
	private LocalDateTime time;
	
	@autowire 
	private BackyardLightSwitcherInterface switcher;
	
    private LocalDateTime lastMotionTime;
    
    public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public LocalDateTime getLastMotionTime() {
		return lastMotionTime;
	}

	public void setLastMotionTime(LocalDateTime lastMotionTime) {
		this.lastMotionTime = lastMotionTime;
	}

	public BackyardLightSwitcherInterface getSwitcher() {
		return switcher;
	}

	public void setSwitcher(BackyardLightSwitcherInterface switcher) {
		this.switcher = switcher;
	}

	public void actuateLights(boolean motionDetected)
    {
        // Update the time of last motion.
        if (motionDetected)
        {
            this.lastMotionTime = this.time;
        }
        
        // If motion was detected in the evening or at night, turn the light on.
        String timeOfDay = TimeUtils.GetTimeOfDay(this.time);
        if (motionDetected && (timeOfDay == "Evening" || timeOfDay == "Night"))
        {
            this.switcher.TurnOn();
        }
        // If no motion is detected for one minute, or if it is morning or day, turn the light off.
        else if (this.time.isBefore(this.lastMotionTime.plusSeconds(60)) || (timeOfDay == "Morning" || timeOfDay == "Noon"))
        {
            this.switcher.TurnOff();
        }
    }
}