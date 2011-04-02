package beans;

import java.util.Date;
import java.lang.String;

public class TimerBean{
  private Date startedAt;

  public TimerBean() {
    this.startedAt = new Date();
  }

  public String timePassed() {
    Date now = new Date();
    long totalSeconds = (now.getTime() - startedAt.getTime()) / 1000;
    long minutes = totalSeconds / 60;
    long seconds = totalSeconds % 60;
    return String.format("%d:%02d", minutes, seconds);
  }

}
