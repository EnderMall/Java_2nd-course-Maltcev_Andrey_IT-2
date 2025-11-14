package Lab_3.Ex4;

public class Dote3d  extends Dote2d{
    private Integer z;
    public Dote3d(){
        super();
        this.z=null;
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
