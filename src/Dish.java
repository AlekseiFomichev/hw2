public class Dish {
    private Integer volume;

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    Dish(Integer volume) {
        this.volume = volume;
    }

    Dish() {
        this.volume = 100;
    }


    boolean eat(Cat cat) {
        if (cat.getFoodPortions() <= this.volume) {
            System.out.println(String.format("кот %s съел %d корма из тарелки. Теперь он сыт", cat.getName(), cat.getFoodPortions()));
            this.volume -= cat.getFoodPortions();
            cat.setHungry(false);
            System.out.println("осталось " + this.volume);
            return true;
        } else {
            System.out.println("недостаточно ");
            System.out.println(String.format("кот %s еще голоден ", cat.getName()));
            return false;
        }
    }

    protected void addFood(Integer volume) {
        this.volume += volume;
    }


}