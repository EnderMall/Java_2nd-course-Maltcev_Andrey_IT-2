package ru.Maltcev.Birds;


public class Sparrow extends Bird {
    private String song;

    @Override
    public void sing(){
        System.out.println("чырык");
        song = "чырык";
    }

    @Override
    public String toString() {
        return this.getName()+" поет : "+(song != null ? song : "что он еще не пел!");
    }
}
