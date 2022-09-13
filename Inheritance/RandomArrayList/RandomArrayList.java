package Inheritance.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList<Object> {


    public Object getRandomElement() {
        Random random = new Random();
        int index = random.nextInt(super.size());
        //  Object element = super.get(index);
        //   super.remove(index);

        return remove(index);
    }
}
