package Lab_2.Ex1;

public class Name {
    public String name;
    public String surName;
    public String patronymic;

    public Name() {
        name=null;
        surName=null;
        patronymic=null;
    }

    @Override
    public String toString() {
        if (patronymic != null){
            return surName+" "+name+" "+patronymic;
        }
        else if (surName !=null){
            return surName+" "+name;
        }
        else {
            return  name;
        }
    }
}
