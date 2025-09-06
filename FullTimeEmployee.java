class FullTimeEmployee extends Employee{
    private double monthSalary;

    FullTimeEmployee(String name, double monthSalary){
        super(name);
        this.monthSalary = monthSalary;
    }

    @Override
    double calculateSalary(){
        return monthSalary;
    }

}
