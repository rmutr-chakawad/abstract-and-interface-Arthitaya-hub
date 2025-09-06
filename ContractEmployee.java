class ContractEmployee extends Employee{
    private double hourWork;
    private double hourlyRate;

    ContractEmployee(String name, double hourWork, double hourlyRate) {
        super(name);
        this.hourWork = hourWork;
        this.hourlyRate = hourlyRate;
    }
    @Override
    double calculateSalary(){
        return hourWork * hourlyRate ;
    }
}
