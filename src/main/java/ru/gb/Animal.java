package ru.gb;

class MainClass {

    public static void main(String[] args) {

        cat cat1 = new cat(); // создаем объект cat1, с помощью сеттера даем емя имя Мурка и печатаем результат в консоль
        cat1.setName("Murka");
        System.out.println(cat1.getName());

        dog dog1 = new dog(); // создаем объект dog1, с помощью сеттера даем емя имя Мурка и печатаем результат в консоль
        dog1.setName("Sharik");
        System.out.println(dog1.getName());

        cat1.swim(); // Вызываем все рабочие методы
        cat1.run();

        dog1.swim();
        dog1.run();

    }
}

public class Animal {
    private int distance = 8; // Создаем 2 приватных поля класса - дистанцию и имя
    private String name;
    
    public Animal() { // Пустой конструктор, он в любом случае априори создается, даже если мы его не прописывали
    }

    public void run() {
        System.out.println("Животное пробежало");
    } // Метод БЕЖАТЬ
                                                                                         // Все животные это умеют
    public void swim() {
        System.out.println("Животное проплыло");
    } // Метод ПЛЫТЬ

    public String getName() {
        return name;
    } // Геттер для получения имени вне класса

    public void setName(String NewName) {
        name = NewName;
    } // Сеттер для изменения имени вне класса

    public int getDistance() { return distance;  } // Геттер для получения дистанции вне класса
}

class cat extends Animal {
    @Override // Переопределение метода БЕЖАТЬ под условия, поставленные для кота, и вывод результата в консоль
    public void run() {
        if (getDistance() <= 200 && getDistance() >= 0) {
            System.out.println("Cat " + getName() + " пробежал " + getDistance() + " метров");
        } else if (getDistance() < 0) {
            System.out.println("Введите положительное значение");
        } else {
            System.out.println("Cat " + getName() + " не может столько пробежать");
        }

    }
    @Override // Переопределение метода ПЛЫТЬ, поставленного для кота, и вывод результата в консоль
    public final void swim() {

        if (getDistance() >= 0) {
            System.out.println("Cat " + getName() + " не умеет плавать");
        } else {
            System.out.println("Cat " + getName() + " не умеет плавать");
        }
    }

}

class dog extends Animal {
    @Override // Переопределение метода БЕЖАТЬ под условия, поставленные для пса, и вывод результата в консоль
    public void run() {

        if (getDistance() <= 500 && getDistance() >= 0) {
            System.out.println("Dog " + getName() + " пробежал " + getDistance() + " метров");
        } else if (getDistance() < 0) {
            System.out.println("Введите положительное значение");
        } else {
            System.out.println("Dog " + getName() + " не может столько пробежать");
        }

    }
    @Override // Переопределение метода ПЛЫТЬ под условия, поставленные для пса, и вывод результата в консоль
    public void swim() {
        if (getDistance() <= 10 && getDistance() >= 0 ) {
            System.out.println("Dog " + getName() + " проплыл " + getDistance() + " метров");
        } else if (getDistance() < 0) {
            System.out.println("Введите положительное значение");
        } else {
            System.out.println("Dog " + getName() + " не может столько проплыть");
        }

    }
}

