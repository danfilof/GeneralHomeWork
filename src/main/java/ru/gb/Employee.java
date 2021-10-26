package ru.gb;

class Employee{

    public static void main(String[] args) {

    }

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private String salary;
    private int age;


    public Employee (String name, String position, String email, String phoneNumber, String salary, int age ) {

        name = "Maria Petrova";
        position = "Math teacher";
        email = "maria.petrova@gmail.com";
        phoneNumber = "89111333333";
        salary = "120";
        age = 33;
    }

      void print() {

        System.out.println("Name: " + name + "Position: " + position + "Email: " + email + "Phone number: " + phoneNumber + "Salary: " + salary + "Age: " + age);
    }
}


