package ru.gb;

class Employee{

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private String salary;
    private int age;

    public static void main(String[] args) {

        Employee[] emp = new Employee[5];
        emp[0] = new Employee ("Ivan Ivanov", "Engineer", "ivan.ivanov@gmail.com", "89214638234", "121", 43);
        emp[1] = new Employee ("Peter Ivanov", "Scientist", "peter.ivanov@gmail.com", "89214388234", "122", 39);
        emp[2] = new Employee ("Ivan Petrov", "Programmer", "ivan.petrov@gmail.com", "89244635554", "119", 41);
        emp[3] = new Employee ("Peter Petrov", "Jobless", "peter.petrov@gmail.com", "89211118234", "105", 24);
        emp[4] = new Employee ("Maria Ivanova", "Math Teacher", "maria.ivanova@gmail.com", "89214631234", "111", 33);


        for ( int i = 0; i < emp.length; i++) {

            if ( emp[i].age > 40) emp[i].EmployeePrint();

        }

    }




    public Employee (String attr_name, String attr_position, String attr_email, String attr_phoneNumber, String attr_salary, int attr_age ) {

        name = attr_name;
        position = attr_position;
        email = attr_email;
        phoneNumber = attr_phoneNumber;
        salary = attr_salary;
        age = attr_age;

    }


      void EmployeePrint () {

        System.out.println("Name: " + name + "; Position: " + position + "; Email: " + email + "; Phone number: " + phoneNumber + "; Salary: " + salary + "; Age: " + age);
    }
}


