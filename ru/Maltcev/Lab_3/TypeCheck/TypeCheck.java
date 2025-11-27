package ru.Maltcev.Lab_3.TypeCheck;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TypeCheck {
    private Scanner scan = new Scanner(System.in);

    public int getNum() {
        while (true){
            try{
                return scan.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Введены неверные данные! Повторите попытку!");
                scan.next();
            }
        }
    }

    public String getString() {
        return scan.nextLine();
    }
    public Boolean getYesOrNo(){
        String temp = scan.next();
        switch (temp.toLowerCase()){
            case "нет","no","ytn","yt","не":{
                return false;
            }
            case "yes","да","lf":{
                return true;
            }
            default:{
                System.out.println("Вы ввели неверную команду, программа продолжит своё выполнение дальше.");
                return false;
            }
        }
    }
}
