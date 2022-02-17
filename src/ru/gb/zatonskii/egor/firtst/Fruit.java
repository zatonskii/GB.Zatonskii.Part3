package ru.gb.zatonskii.egor.firtst;

public class Fruit {
    private float WeightFruit;
    private String ColourFruit; //В задании нет речи про цвет. Это для себя и пока что не имею понятия, что буду с ним делать по итогу//

    public Fruit(float WeightFruit, String ColourFruit) {
        this.WeightFruit = WeightFruit;
        this.ColourFruit = ColourFruit;
    }

    public float getWeightFruit() {
        return WeightFruit;
    }

    public String getColourFruit() {
        return ColourFruit;
    }
}
