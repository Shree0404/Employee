public class Employee{
    String name;
    int id;
    double salary;
    String address;
    public Employee(String name, int id,double salary,String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address= address;
    }
    public void displayInfo() {
        System.out.println("Employee Id; " + id);
        System.out.println("Employee Nmae; " + name);
        System.out.println("Employee salary; " + salary);
        System.out.println("Employee Address; " + address);

    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("xyz", 102, 200000,"hubli");
        emp1.displayInfo();
    }

}
