import java.util.ArrayList;
import java.util.List;

public class EmployeeApplication {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Pinky", "priya", "HR", 1001, 20);
        Employee emp2 = new Employee("Neha", "priya", "IT", 1002, 25);

        //emp1.introduction();
        //emp2.introduction();

        Manager manager = new Manager("Preethi", 50);
        //manager.introduction();

       // Employee[] employees = {emp1, emp2, manager};

        List<Employee> employees = new ArrayList<>();
        employees.add (emp1);
        employees.add(emp2);
        employees.add (manager);
        for (Employee e : employees) {
            System.out.println(e);
        }


//        manager.addEmployee(emp1);
//        manager.addEmployee(emp2);
//
//        for (int i=0; i<employees.length; i++){
//            System.out.println(employees[i]);
//        }
//
//        Manager manager2 = new Manager("Tooth Fairy", 18);
//        Employee emp3 = new Employee("Tooth Fairy Apprentice", 16);
//        manager2.addEmployee(emp3);
//
//        Manager superManager = new Manager("Queen Sparklewings", 25);
//        superManager.addEmployee(manager);
//        superManager.addEmployee(manager2);
//
//        System.out.println(superManager);
    }
}


