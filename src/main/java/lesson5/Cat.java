package lesson5;

public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat (String _name, String _color, int _age) {
        name = _name;
        color = _color;
        age = _age;

    }

    public Cat (String color, int age) {
        this.color = color;
        this.age = age;
        this.name = "Неизвестно";
    }

    public Cat (String color) {
        this(color, 0);
    }

    /**
     * Вывдит информацию об объекте
     */
    public void info () {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public Cat () {}

    public void setName(String name) {
        this.name = name;
    }
}
