package ru.Maltcev.Lab_3.Geometry;

public class Dote3d  extends Dote2d {
    private Integer z;
    public Dote3d(int x, int y, int z){
        super(x,y);
        this.z=z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Integer getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "{"+this.getX()+";"+this.getY()+";"+this.getZ()+"}";
    }
}
