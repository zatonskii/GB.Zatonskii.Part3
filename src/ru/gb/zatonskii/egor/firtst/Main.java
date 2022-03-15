package ru.gb.zatonskii.egor.firtst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String cats[] = {"Persey, ", "Max, ", "Foxy, ", "Boris, ", "Felix, ", "Vaksa, ", "Mysya, ", "Baks, "};
        swapPlacesCats(cats,3, 0);
        new ArrayToArrayList();
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

    public static class ArrayToArrayList {
        public static void replaceTwoElements(Object[] arr, int i1, int i2) {
        Object temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static <E> ArrayList<E> arrToList(E[] arr) {
        ArrayList<E> result = new ArrayList<E>(arr.length);
        for (E e : arr) {
            result.add(e);
        }
        return result;

    }
}

    public static void BoxFruit() {
        Box<Apple> appleBox = new Box<>(new Apple(1.1f,"GREEN"), new Apple(0.9f,"YELLOW"), new Apple(2.0f, "RED"));
        Box<Orange> orangeBox = new Box<>(new Orange(1.5f, "RED"), new Orange(2.5f, "YELLOW"), new Orange(2.0f, "ORANGE"));
        // определил для каждого фрукта разный вес - этого не было в задаче
        // определил для каждого фрукта цвет - этого не было в задаче

        System.out.println(appleBox.comparisonWeight(orangeBox));

        Box<Orange> secondOrangeBox = new Box<>(new Orange(2.2f, "ORANGE"));

        System.out.println("Первая коробка с апельсинами весит: " + orangeBox.getWeightBoxAndFruit());
        orangeBox.shiftFruits(secondOrangeBox);
        System.out.println("Общий вес апельсинов после пересыпания: " + secondOrangeBox.getWeightBoxAndFruit());
        System.out.println("Вес пустой коробки из под апельсинов: " + orangeBox.getWeightBoxAndFruit());
        System.out.println();
        // результат яблок в консоли 4.5 вместо 4.0
        // результат апельсинов в консоли 88 вместо 8.2
    }
}

