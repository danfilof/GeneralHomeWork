package ru.gb;

public class Animals {
     int distance = 199;
     String name;

    public static void main(String[] args) {

        cat cat1 = new cat();
        cat1.name = "Barsik";
        dog dog1 = new dog();
        dog1.name = "Bobik";
        dog1.run();
        dog1.swim();
        cat1.run();
        cat1.swim();
    }


    public Animals() {

    }

    public void run() {

        System.out.println("Животное пробежало");
    }

    public void swim() {
        System.out.println("Животное проплыло");
    }

}

class cat extends Animals {


    @Override
    public void run() {

        if (distance <= 200) {

            this.distance = distance;
            System.out.println(name + " пробежал " + distance + " метров");


        } else if (distance < 0) {

            System.out.println("Введите положительное значение");

        } else {

            System.out.println(name + " не может столько пробежать");

        }

    }
    @Override
    public final void swim() {

        if (distance >= 0) {

            System.out.println(name + " не умеет плавать");

        } else {

            System.out.println(name + " не умеет плавать");

        }
    }

}




class dog extends Animals {


    @Override
    public void run() {

        if (distance <= 500) {

            this.distance = distance;
            System.out.println(name + " пробежал " + distance + " метров");

        } else if (distance < 0) {

            System.out.println("Введите положительное значение");

        } else {

            System.out.println(name + " не может столько пробежать");

        }

    }
    @Override
    public void swim() {

        if (distance <= 10) {

            this.distance = distance;
            System.out.println(name + " проплыл " + distance + " метров");

        } else if (distance < 0) {

            System.out.println("Введите положительное значение");

        } else {

            System.out.println(name + " не может столько проплыть");

        }

    }

}

