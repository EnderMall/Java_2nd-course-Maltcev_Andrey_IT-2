package Lab_3.Ex4;

public class Dote2d {
    private Integer x;
    private Integer y;

    public  Dote2d(){
        this.x=null;
        this.y=null;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getX() {
        return x;
    }
    public Integer getY() {
        return y;
    }

    @Override
    public String toString() {
        return "{"+x+";"+y+"}";
    }
}
