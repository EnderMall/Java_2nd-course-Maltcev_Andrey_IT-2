package Lab_2.Ex6;

public class TimeToSleep {
    public int seconds;

    public TimeToSleep(int seconds) {
        this.seconds = seconds % 86400;
    }

    public int getHours() {
        return (seconds / 3600) % 24;
    }

    public int getMinutes() {
        return (seconds % 3600) / 60;
    }

    public int getSeconds() {
        return seconds % 60;
    }
}
