package ru.Maltcev.Times;

import Lab_2.Ex6.TimeToSleep;

public class DayTime extends TimeToSleep {

    public DayTime(int seconds) {
        super(normalSeconds(seconds));
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds + 86400) % 86400;
    }

    private static int normalSeconds(int seconds){
        return (seconds % 86400 + 86400);
    }

    @Override
    public String toString() {
        setSeconds(seconds);
        return "Времени с начала дня прошло:"+this.seconds+", а если перевести ваше время, получим: "+
                this.getHours()+" часов, "+this.getMinutes()+" минут, "+this.getSeconds()+" секунд.";
    }
}
