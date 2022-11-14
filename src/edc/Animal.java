package edc;

public class Animal {
    int age;
    String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal eating...");
    }

    @Override
    public String toString() {
        return "Age = "+ age+ " Name is " + name;
    }
}