package lesson5;

public class Worker {
    private String name;
    private String post;
    private String e_mail;
    private long phone;
    private int salary;
    private int age;

    public Worker(String name, String post, String e_mail,
                  long phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.e_mail = e_mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
