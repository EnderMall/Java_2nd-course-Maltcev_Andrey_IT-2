package ru.Maltcev.Lab_3.Geometry;

import java.util.Objects;

public class Dote2d {
    private Integer x;
    private Integer y;

    public  Dote2d(int x, int y){
        this.x=x;
        this.y=y;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dote2d dote2d = (Dote2d) o;
        return Objects.equals(x, dote2d.x) && Objects.equals(y, dote2d.y);
    }

}
