import java.time.LocalDateTime;

public class SmartHomeController
{
    private LocalDateTime lastMotionTime;

	public void ActuateLights(boolean motionDetected)
    {
		LocalDateTime time = LocalDateTime.now();

        // Update the time of last motion.
        if (motionDetected)
        {
            this.lastMotionTime = time;
        }
        
        // If motion was detected in the evening or at night, turn the light on.
        String timeOfDay = TimeUtils.GetTimeOfDay();
        if (motionDetected && (timeOfDay == "Evening" || timeOfDay == "Night"))
        {
            BackyardLightSwitcher.TurnOn();
        }
        // If no motion is detected for one minute, or if it is morning or day, turn the light off.
        else if (time.isBefore(this.lastMotionTime.plusSeconds(60)) || (timeOfDay == "Morning" || timeOfDay == "Noon"))
        {
            BackyardLightSwitcher.TurnOff();
        }
    }
}