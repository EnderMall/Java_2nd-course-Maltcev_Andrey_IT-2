package ru.Maltcev.Lab_4.Objects;

public class Box<T> {
    private T inside;
    public Box() {}

    public T take() {
        if (this.isEmpty()){
            throw new IllegalStateException ("В коробке ничего нет!");
        }
        T something = inside;
        inside = null;
        return something;
    }

    public void put(T inside) {
        if (!this.isEmpty()){
            throw new IllegalStateException ("В коробке уже что то есть!");
        }
        this.inside = inside;
    }
    public boolean isEmpty(){
        return this.inside == null;

    }
}
