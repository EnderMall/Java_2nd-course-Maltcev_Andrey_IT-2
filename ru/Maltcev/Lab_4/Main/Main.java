package ru.Maltcev.Lab_4.Main;

import ru.Maltcev.Lab_3.Geometry.Dote3d;
import ru.Maltcev.Lab_4.Objects.Box;
import ru.Maltcev.Lab_4.Objects.Storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

    private static void exCode1(){
        System.out.println("\nЗадание 4.1.1");

        Box<Integer> number = new Box<>();
        number.put(3);
        outBoxValue(number);
    }
    private static void outBoxValue (Box<Integer> box) {
        int number = box.take();
        System.out.println("В коробке было число: "+number);
    }

    private static void exCode2(){
        System.out.println("\nЗадание 4.1.2");

        Storage<Integer> safe1 = new Storage<>(null,0);
        outStorageValue(safe1);

        Storage<Integer> safe2 = new Storage<>(99,-1);
        outStorageValue(safe2);


        Storage<String> safe3 = new Storage<>(null,"default");
        outStorageString(safe3);

        Storage<String> safe4 = new Storage<>("hello","hello world");
        outStorageString(safe4);
    }

    private static void outStorageValue (Storage<Integer> safe) {
        Integer numb = safe.get();
        System.out.println("В коробке было число: "+numb);
    }

    private static void outStorageString (Storage<String> safe) {
        String str = safe.get();
        System.out.println("В коробке была строка: "+str);
    }

    private  static  void exCode3(){
        System.out.println("\nЗадание 4.2.3");

        Box<Dote3d> box = new Box<>();
        Dote3d dote = new Dote3d(1,3,5);
        combine(box,dote);

        System.out.println("Точка в коробке!");

        Box<Object> boxOrObject = new Box<>();
        combine(boxOrObject,dote);

        System.out.println("Коробка для объектов съела точку!");

    }
    private static void combine(Box<? super Dote3d> something, Dote3d dote){
        something.put(dote);
    }

    private  static  void exCode4() {
        System.out.println("\nЗадание 4.3.1");

        List<String> strings = List.of("qwerty", "asdfg", "zx");
        List<Integer> lengths = map(strings, String::length);

        System.out.println(lengths);

        List<Integer> numbers = List.of(1, -3, 7);
        List<Integer> absValues = map(numbers, Math::abs);

        System.out.println(absValues);

        List<int[]> arrays = List.of(new int[]{1,2,3}, new int[]{-5,0,5});
        List<Integer> maxValues = map(arrays, arr -> {
            int max = arr[0];
            for (int num : arr) if (num > max) max = num;
            return max;
        });

        System.out.println(maxValues);

    }

    private static <T, R> List<R> map(List<T> list, Transform<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            result.add(function.apply(item));
        }
        return result;
    }

    private  static  void exCode5() {
        System.out.println("\nЗадание 4.3.2");
        List<String> strings = List.of("qwerty", "asdfg", "zx");
        List<String> lengths = filter(strings, s ->s.length()>=3);

        System.out.println(lengths);

        List<Integer> numbers = List.of(1, -3, 7);
        List<Integer> pos = filter(numbers,n -> n>0);

        System.out.println(pos);

        List<int[]> arrays = List.of(new int[]{1,2,3}, new int[]{-5,0,5});
        List<int[]> allPos = filter(arrays, arr -> {
            int lenArr = arr.length;
            int count = 0;
            for (int j : arr) {
                if (j > 0) {
                    count += 1;
                }
            }
            return (lenArr==count);
        });

        System.out.println(Arrays.deepToString(allPos.toArray()));
    }

    private static <T>List<T> filter(List<T> list, Filtrate<T> filter){
        List<T> res = new ArrayList<>();
        for (T item :list){
            if (filter.test(item)){
                res.add(item);
            }
        }
        return res;
    }

    private  static  void exCode6() {
        System.out.println("\nЗадание 4.3.3");
        List<String> strings = List.of("qwerty", "asdfg", "zx");
        String outStr = reductor(strings,"",(res,s)->res+s);

        System.out.println(outStr);

        List<Integer> numbers = List.of(1, -3, 7);
        int outInt = reductor(numbers,0, Integer::sum);

        System.out.println(outInt);

        List<int[]> arrays = List.of(new int[]{1,2,3}, new int[]{-5,0,5});
        int outIntLen = reductor(arrays,0,(res,arr)->res+arr.length);

        System.out.println(outIntLen);

    }
    private static <T,R> R reductor(List<T> list,R argument, Reduct<T,R> reducted){
        if (list == null){
            return argument;
        }
        R res = argument;
        for (T item :list){
            res = reducted.reduct(res,item);
        }
        return res;

    }


    private  static  void exCode7() {
        System.out.println("\nЗадание 4.3.4");
        List<Integer> numbers = List.of(1, -3, 7);
        ArrayList<Integer> positives = collect(numbers, (list, num) -> {
            if (num > 0) list.add(num);
            }, ArrayList::new);

        ArrayList<Integer> negatives = collect(numbers,
                (list, num) -> {
            if (num < 0) list.add(num);
            }, ArrayList::new);

        System.out.println("1. Положительные: " + positives + ", Отрицательные: " + negatives);

        List<String> strings = List.of("qwerty", "asdfg", "zx", "qw");
        ArrayList<String> length6 = collect(strings,
                (list, str) -> {
            if (str.length() == 6) list.add(str);
            }, ArrayList::new);

        ArrayList<String> length5 = collect(strings,
                (list, str) -> {
            if (str.length() == 5) list.add(str);
            }, ArrayList::new);

        ArrayList<String> length2 = collect(strings,
                (list, str) -> {
            if (str.length() == 2) list.add(str);
            }, ArrayList::new);

        System.out.println("\n2. Группы по длине:");
        System.out.println("   Длина 6: " + length6);
        System.out.println("   Длина 5: " + length5);
        System.out.println("   Длина 2: " + length2);

        List<String> stringsWithDups = List.of("qwerty", "asdfg", "qwerty", "qw");
        HashSet<String> unique = collect(stringsWithDups, HashSet::add, HashSet::new);

        System.out.println("\n3. Уникальные строки: " + unique);
    }

    public static <T, P> P collect(List<T> items, Colector<T, P> collector, Giver<P> supplier) {

        P result = supplier.give();
        for (T item : items) {
            collector.collect(result, item);
        }
        return result;
    }


    public static void main(String[] args){
        exCode1();
        exCode2();
        exCode3();
        exCode4();
        exCode5();
        exCode6();
        exCode7();

    }
}
