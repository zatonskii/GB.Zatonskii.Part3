package ru.gb.zatonskii.egor.firtst;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruitList;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public int getWeight() {

        if (fruitList.isEmpty()) {
            return 0;
        } else {
            if (fruitList.get(0) instanceof Apple) {
                return fruitList.size();
            } else {
                return fruitList.size() * 2;
            }
        }
    }
    public void print (){
        int counter = 1;
        for (int i = 0; i < fruitList.size(); i++) {
            System.out.printf("Вес %d фрукта = %.1f\n", counter, fruitList.get(i).getWeightFruit());
            counter++;
        }
        System.out.println("Вес всех фруктов = " + getWeight());
    }

    public boolean compare(Box<? extends Fruit> box) {
        return getWeight() == box.getWeight();
    }
    public boolean food(Box<T> box) {
        fruitList.addAll(box.fruitList);
        box.fruitList.clear();
        return false;
    }
}
