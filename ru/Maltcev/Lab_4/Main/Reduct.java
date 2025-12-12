package ru.Maltcev.Lab_4.Main;

public interface Reduct<T,R> {
    R reduct(R out,T something);
}
