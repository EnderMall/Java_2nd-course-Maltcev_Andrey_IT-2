package Lab_2;

import Lab_2.Ex1.Ex1code;
import Lab_2.Ex2.Ex2code;
import Lab_2.Ex3.Ex3code;
import Lab_2.Ex4.Ex4code;
import Lab_2.Ex5.Ex5code;
import Lab_2.Ex6.Ex6code;

public class Main {
    public static void main(String[] args) {
        
        Ex1code ex1= new Ex1code();
        boolean answ= ex1.code();
        while (answ){
            answ=ex1.code();
        }

        Ex2code ex2= new Ex2code();
        answ= ex2.code();
        while (answ){
            answ=ex2.code();
        }

        Ex3code ex3= new Ex3code();
        ex3.code();

        Ex4code ex4= new Ex4code();
        ex4.code();


        Ex5code ex5= new Ex5code();
        ex5.code();

        Ex6code ex6 = new Ex6code();
        ex6.code();

    }
}
