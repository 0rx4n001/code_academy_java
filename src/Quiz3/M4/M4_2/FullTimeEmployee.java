package Quiz3.M4.M4_2;

public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }



    @Override
    protected double calculateSalary() {

        return monthlySalary ;
    }
}
