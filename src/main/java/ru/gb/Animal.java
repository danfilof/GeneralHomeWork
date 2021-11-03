package ru.gb;

class MainClass {

    public static void main(String[] args) {

        cat cat1 = new cat();
        cat1.setName("Murka");
        System.out.println(cat1.getName());

        dog dog1 = new dog();
        dog1.setName("Sharik");
        System.out.println(dog1.getName());

        cat1.swim();
        cat1.run();

        dog1.swim();
        dog1.run();


       // cat1.name = "Barsik";
        System.out.println(cat1.getName());
        //dog1.name = "Bobik";
        System.out.println(dog1.getName());
    }
}

public class Animal {
    private int distance = 199;
    private String name;
    
    public Animal() {
    }

    public void run() {
        System.out.println("Животное пробежало");
    }

    public void swim() {
        System.out.println("Животное проплыло");
    }

    public String getName() {
        return name;
    }

    public void setName(String NewName) {
        name = NewName;
    }

    public int getDistance() { return distance;  }
}

class cat extends Animal {


    @Override
    public void run() {
        if (getDistance() <= 200 && getDistance() >= 0) {
            System.out.println("Cat " + getName() + " пробежал " + getDistance() + " метров");
        } else if (getDistance() < 0) {
            System.out.println("Введите положительное значение");
        } else {
            System.out.println("Cat " + getName() + " не может столько пробежать");
        }

    }
    @Override
    public final void swim() {

        if (getDistance() >= 0) {
            System.out.println("Cat " + getName() + " не умеет плавать");
        } else {
            System.out.println("Cat " + getName() + " не умеет плавать");
        }
    }

}

class dog extends Animal {
    @Override
    public void run() {

        if (getDistance() <= 500 && getDistance() >= 0) {
            System.out.println("Dog " + getName() + " пробежал " + getDistance() + " метров");
        } else if (getDistance() < 0) {
            System.out.println("Введите положительное значение");
        } else {
            System.out.println("Dog " + getName() + " не может столько пробежать");
        }

    }
    @Override
    public void swim() {
        if (getDistance() <= 10) {
            System.out.println("Dog " + getName() + " проплыл " + getDistance() + " метров");
        } else if (getDistance() < 0) {
            System.out.println("Введите положительное значение");
        } else {
            System.out.println("Dog " + getName() + " не может столько проплыть");
        }

    }
}

