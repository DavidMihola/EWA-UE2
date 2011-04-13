package beans;

import timer.Timer;

import java.util.Date;
import java.lang.String;

public class TimerBean{
	private Timer timer;	

	public TimerBean() {
	    timer = new Timer();
	}

	public String getTime() {
		long totalSeconds = timer.getTime() / 1000;
		long minutes = totalSeconds / 60;
		long seconds = totalSeconds % 60;
		return String.format("%d:%02d", minutes, seconds);
	}
}
