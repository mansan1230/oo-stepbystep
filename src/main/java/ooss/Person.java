package ooss;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    private int id;
    public Person(int id ,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }

    public String introduce(){
        return String.format("My name is %s. I am %d years old.", name, age);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
