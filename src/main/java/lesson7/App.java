package lesson7;

public class App {
    public static void main(String[] args) {
        Plate plate1 = new Plate("red", 30);
        Cat[] cat = new Cat[2];
        cat[0] = new Cat("Васька", 15);
        cat[1] = new Cat("Борис", 25);

        plate1.toFillPlate();
        System.out.println();

        for (Cat kitty: cat){
            kitty.catsEat(plate1);
        }
    }
}
