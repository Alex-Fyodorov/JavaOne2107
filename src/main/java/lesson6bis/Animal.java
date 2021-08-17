package lesson6bis;

public abstract class Animal {
    protected String name;
    protected int runDistance;
    protected int swimDistance;
    protected static int count;

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", runDistance=" + runDistance +
                ", swimDistance=" + swimDistance +
                '}';
    }
}
