import java.util.HashMap;

public class employeemanagement
 {
    public static void main(String[] args) {
        HashMap<String, Employee> employees = new HashMap<>();
        employees.put("John", new Employee("John", 50000.0, 10));
        employees.put("Alice", new Employee("Alice", 60000.0, 12));

        double totalSalary = 0;
        for (Employee employee : employees.values()) {
            totalSalary += employee.getSalary() * employee.getMonths();
        }

        System.out.println("Total Salary: " + totalSalary);
    }
}

class Employee {
    private String name;
    private double salary;
    private int months;

    public Employee(String name, double salary, int months) {
        this.name = name;
        this.salary = salary;
        this.months = months;
    }

    public double getSalary() {
        return salary;
    }

    public int getMonths() {
        return months;
    }
}