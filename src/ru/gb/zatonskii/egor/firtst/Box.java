package ru.gb.zatonskii.egor.firtst;

import java.util.*;

public class Box<T extends Fruit> {
    // честно говоря, не понял, как коробка может наследоваться от фруктов
    // коробка - не съедобное, фрукт - съедобное.
    // без наследования ничего не вышло
    private List<T> fruitList;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public Box(List<T> fruitList) {
        this.fruitList = new ArrayList<>(fruitList);
    }

    public Box(T... fruitList) {
        this.fruitList = new ArrayList<T>(Arrays.asList(fruitList));
    }
    // эти три конструктора взял из кода урока и не понимаю, что они делают.

    // добавляем фрукты
    public void addFruit(T fruitList) {
        this.fruitList.add(fruitList);
    }

    // метод сравнивающий вес
    public float getWeightBoxAndFruit() {
        if (this.fruitList.size() == 0)
            return  0.0f;
        return this.fruitList.size() * this.fruitList.get(0).getWeightFruit();
    }

   // хотел написать метод, который сортирует цвета фруктов и выводит в консоль, но...
//    public int getColourFruit() {
//       if (this.fruitList.size() == 0)
//           return getColourFruit();
//       return getColourFruit();
//    }

//    public Integer colourFruit(Box<T> another) {
//        return Collections.sort(fruitList);
//    }
    //...что-то пошло не так

    public boolean comparisonWeight(Box<?> another) {
        return Math.abs(getWeightBoxAndFruit() - another.getWeightBoxAndFruit()) < 0.0001f;
    }
    // метод взял из стрима. У меня было нагромождение кода с циклами и выглядело ужасно

    // Метод, который пересыпает фрукты из коробки
    public void shiftFruits(Box<? super  T> another) {
        if (this == another)
            return;
        another.fruitList.addAll(fruitList);
        fruitList.clear();
    }

    public List<T> getFruitList() {
        return fruitList;
    }

}
