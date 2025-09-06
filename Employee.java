public abstract class Employee {
    String name;
    double salary;

    Employee(String name) {
        this.name = name;
    }
    abstract double calculateSalary();

    void showSalary() {
        salary = calculateSalary();
        System.out.println("ชื่อ: " + name);
        System.out.println("เงินเดือน: " + (int)salary);
    }

}
