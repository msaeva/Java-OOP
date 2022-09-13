package Solid.solid;

import solid.products.*;

import java.util.List;

public class CalorieCalculator {

    public CalorieCalculator() {
    }

    public double sum(List<Product> products) {
        return products.stream().mapToDouble(Product::getAmountOfCalories).sum();
    }

//    public double sum(List<Object> products) {
//        double sum = 0;
//
//        for (Object product : products) {
//            if (product instanceof Coke) {
//                double grams = ((Coke) product).getMilliliters() * Coke.DENSITY;
//                sum += (Coke.CALORIES_PER_100_GRAMS / 100) * grams;
//            }
//
//            if (product instanceof Lemonade) {
//                double grams = ((Lemonade) product).getMilliliters() * Lemonade.DENSITY;
//                sum += (Lemonade.CALORIES_PER_100_GRAMS / 100) * grams;
//            }
//
//            if (product instanceof Chocolate) {
//                sum += (Chocolate.CALORIES_PER_100_GRAMS / 100) * ((Chocolate) product).getGrams();
//            }
//        }
//
//        return sum;
//    }

    public double average(List<Product> products) {
        return sum(products) / products.size();
    }

}
