package Lab_2.Ex2;
import java.text.DecimalFormat;

public class Time {
    public int time;

    public Time() {
        time = 0;
    }

    @Override
    public String toString() {
        int time_sek = this.time%60;
        int time_min= (this.time%3600)/60;
        int time_hour= (this.time/3600)%24;
        DecimalFormat df = new DecimalFormat("00");
        String ts = df.format(time_sek);
        String tm = df.format(time_min);
        return time_hour+":"+tm+":"+ts;
    }
}
