import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Пусик", 40);
        Cat cat2 = new Cat();
        Cat cat3 = new Cat("Русик", 20);
        Cat cat4 = new Cat("Васик", 50);
        Cat cat5 = new Cat("Закись", 25);
        Cat cat6 = new Cat("Пивасик", 30);
        Cat cat7 = new Cat("Ананасик", 28);

        List<Cat> catArr = new ArrayList<>();
        catArr.add(cat1);
        catArr.add(cat2);
        catArr.add(cat3);
        catArr.add(cat4);
        catArr.add(cat5);
        catArr.add(cat6);
        catArr.add(cat7);

        Dish dish1 = new Dish(100);

        for (Cat cat : catArr){
            dish1.eat(cat);
        }

        for (Cat cat : catArr){
            System.out.println(cat.getName() + " голоден? " + cat.getHungry());
        }

        dish1.addFood(100);

        for (Cat cat : catArr){
            if (cat.getHungry() == true){
                dish1.eat(cat);
            }
        }
    }

}