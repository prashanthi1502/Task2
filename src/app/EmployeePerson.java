package app;

public class EmployeePerson {
        protected String name;
        protected int age;
        public EmployeePerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display person details
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    class Employee extends Person {
        private String employeeID;
        private double salary;

        // Constructor to initialize name, age, employeeID, and salary
        public Employee(String name, int age, String employeeID, double salary) {
            super(name, age);// Call the constructor of the base class (Person)
            this.employeeID = employeeID;
            this.salary = salary;
        }

        public void displayDetails() {
            System.out.println("EmployeeID: " + employeeID);
            System.out.println("Salary: " + salary);
        }

        public static void main(String[] args) {
            // Create an instance of Employee
            Employee emp = new Employee("Prasanthi", 22, "E12345", 50000.0);

            // Display details of the employee
            emp.displayDetails();
        }
    }

