package lesson7;

public class Plate {
    private String color;
    private int size;
    private int food;

    public Plate(String color, int size) {
        this.color = color;
        this.size = size;
        this.food = 0;
    }

    public void toFillPlate(){
        System.out.println("Наполняем пустую тарелку.");
        food = size;
        System.out.println("Наполненность тарелки: " + food);
    }

    public int decreaseFood(int n){
        if (food >= n){
            food -= n;
            n = 0;
        } else {
            n -= food;
            food = 0;
        }
        return n;
    }
}
