package OOPExams.zoo.entities.foods;

public class Vegetable extends BaseFood {
    private static final int CALORIES = 50;
    private static final int PRICE = 5;

    public Vegetable() {
        super(CALORIES, PRICE);
    }


    @Override
    public int getCalories() {
        return CALORIES;
    }

    @Override
    public double getPrice() {
        return PRICE;
    }
}
