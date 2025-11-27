package ru.Maltcev.Birds;

public class BirdAdapt implements SingASong {
    private Bird bird;

    public BirdAdapt(Bird bird){
        this.bird = bird;
    }
    @Override
    public void sing(){
        bird.sing();
    }

}
