public class TestEmployee {
    public static void main(String[] args) {

        Employee salary = new FullTimeEmployee("สมชาย",25000);
        Employee hourlyRate = new ContractEmployee("สมหญิง",240,60);

        salary.showSalary();
        hourlyRate.showSalary();

        int total = (int)(salary.calculateSalary() + hourlyRate.calculateSalary());
        System.out.println("ผลรวมเงินเดือนทั้งหมด: " + total);
    }
}
