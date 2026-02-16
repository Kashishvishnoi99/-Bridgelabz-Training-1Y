 public class Employee {
    String Name;
    int Id;
    double Salary;

    Employee(String Name, int Id, double Salary) {
        this.Name = Name;
        this.Id = Id;
        this.Salary = Salary;
    }

    void DisplayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + Name);
        System.out.println("Id: " + Id);
        System.out.println("Salary: " + Salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee Emp = new Employee("John", 101, 50000);
        Emp.DisplayDetails();
    }
}
