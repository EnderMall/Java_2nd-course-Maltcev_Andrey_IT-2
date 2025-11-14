package Lab_3.Ex3;

import Lab_3.TypeCheck;

public class Ex3code {
    public void code(){
        System.out.println("Задание 3\n");
        TypeCheck check = new TypeCheck();
        Node tree = new Node();
        boolean ist=true;
        while (ist){
            System.out.println("Введите число для добавления в дерево.");
            tree.add(check.getNum());
            System.out.println("Хотите ввести еще данные?(Да/Нет)");
            if (!check.getYesOrNo()){
                ist=false;
            }
        }
        System.out.println(tree);
        System.out.println("Ваше дерево, хотите удалить какой то из элементов?(Да/Нет)");
        if (check.getYesOrNo()){
            System.out.println("Введите значение, которое хотите удалить.");
            tree.remove(check.getNum());
        }
        System.out.println("Вот и ваше дерево!");
        System.out.println(tree);
    }
}
