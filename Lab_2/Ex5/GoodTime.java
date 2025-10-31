package Lab_2.Ex5;

import Lab_2.Ex2.Time;

public class GoodTime extends Time {
    public boolean type;
    public int hh;
    public int mm;
    public int ss;

    public GoodTime(boolean type) {
        this.type = type;
        if (type){
            hh=0;
            mm=0;
            ss=0;
        }
        else {
            super.time=1;
        }
    }
    @Override
    public String toString() {
        if(!this.type){
            return super.toString();
        }
        else {
            hh=hh*3600;
            mm=mm*60;
            String res="";
            res= String.valueOf(hh+mm+ss);
            return res;
        }
    }
}
