package ru.gb.zatonskii.egor.firtst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String cats[] = {"Persey, ", "Max, ", "Foxy, ", "Boris, ", "Felix, ", "Vaksa, ", "Mysya, ", "Baks, "};
        Integer weight[] = {9, 7, 1, 8, 10, 2, 5, 6};
        swapPlacesCats(cats,3, 0);
        prototypeCats(weight);
      ArrayToArrayList();
      BoxFruit();
    }
    static <C> void swapPlacesCats(C[] cats, int valueOne, int valueTwo) {
        C temporary;
        temporary = cats[valueOne];
        cats[valueOne] = cats[valueTwo];
        cats[valueTwo] = temporary;
        System.out.println(Arrays.toString(cats));
    }
    static <C> void prototypeCats(C[] cats) {
        ArrayList<C> arrList = new ArrayList<>();
        Collections.addAll(arrList,cats);
        System.out.println(arrList);
    }

    public static void ArrayToArrayList() {
        Integer[] values = { 1, 3, 7 };
        List<Integer> list = new ArrayList<>(Arrays.asList(values));
        System.out.println("Первый элемент" + list.get(0));
    }

    public static void BoxFruit() {
        Apple apple0 = new Apple(1.0f);
        Apple apple1 = new Apple(1.0f);

        Box <Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.compare(orangeBox);
        appleBox.food(appleBox);

        appleBox.addFruit(apple0);
        appleBox.addFruit(apple1);
        appleBox.addFruit(new Apple(4.0f));

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(apple0);
        appleBox1.addFruit(apple1);
        appleBox.addFruit(new Apple(4.0f));

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple(4.0f));

        Box<Apple> nullAppleBox = new Box<>();

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange(1.5f));
        orangeBox1.addFruit(new Orange(3.0f));
        orangeBox1.addFruit(new Orange(4.5f));

        System.out.println("Box orange = " + orangeBox1.getWeight());
        System.out.println("Box apple = " + appleBox1.getWeight());
        System.out.println(appleBox.compare(orangeBox));

        orangeBox.print();

        appleBox2.food(nullAppleBox);
        nullAppleBox.print();
    }
}

