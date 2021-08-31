package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private int hunger;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = appetite;
    }

    public void catsEat(Plate pl){
        hunger = pl.decreaseFood(hunger);
        if (hunger == 0){
            System.out.println(name + " наелся и мурлыкает.");
        } else {
            System.out.println(name + " недовольно орёт. Его голод = " + hunger + ".");
        }
    }
}
