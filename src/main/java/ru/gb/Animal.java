package ru.gb;

class MainClass {

    public static void main(String[] args) {

        cat cat1 = new cat();
        cat1.SetName("Murka");
        System.out.println(cat1.GetName());

        dog dog1 = new dog();
        dog1.SetName("Sharik");
        System.out.println(dog1.GetName());

        cat1.swim();
        cat1.run();

        dog1.swim();
        dog1.run();


        // Why the hell those variables are visible for MAIN?!?
        cat1.name = "Barsik";
        System.out.println(cat1.GetName());
        dog1.name = "Bobik";
        System.out.println(dog1.GetName());
    }
}

public class Animal {
    protected int distance = 199;
    protected String name;

    public Animal() {
    }

    public void run() {
        System.out.println("Животное пробежало");
    }

    public void swim() {
        System.out.println("Животное проплыло");
    }

    public String GetName() {
        return name;
    }

    public void SetName(String NewName) {
        name = NewName;
    }
}

class cat extends Animal {
    @Override
    public void run() {
        if (distance <= 200) {
            System.out.println("Cat " + name + " пробежал " + distance + " метров");
        } else if (distance < 0) {
            System.out.println("Введите положительное значение");
        } else {
            System.out.println("Cat " + name + " не может столько пробежать");
        }

    }
    @Override
    public final void swim() {

        if (distance >= 0) {
            System.out.println("Cat " + name + " не умеет плавать");
        } else {
            System.out.println("Cat " + name + " не умеет плавать");
        }
    }

}

class dog extends Animal {
    @Override
    public void run() {

        if (distance <= 500) {
            System.out.println("Dog " + name + " пробежал " + distance + " метров");
        } else if (distance < 0) {
            System.out.println("Введите положительное значение");
        } else {
            System.out.println("Dog " + name + " не может столько пробежать");
        }

    }
    @Override
    public void swim() {
        if (distance <= 10) {
            System.out.println("Dog " + name + " проплыл " + distance + " метров");
        } else if (distance < 0) {
            System.out.println("Введите положительное значение");
        } else {
            System.out.println("Dog " + name + " не может столько проплыть");
        }

    }
}

