public class Employee{
    String name;
    int id;
    double salary;
    public Employee(String name, int id,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Employee Id; " + id);
        System.out.println("Employee Nmae; " + name);
        System.out.println("Employee salary; " + salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("xyz", 102, 200000);
        emp1.displayInfo();
    }

}
