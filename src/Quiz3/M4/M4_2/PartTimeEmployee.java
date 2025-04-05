package Quiz3.M4.M4_2;

public class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hWorked;

    public PartTimeEmployee(String name,  double hourlyRate, int hWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hWorked = hWorked;
    }


    @Override
    protected double calculateSalary() {

        return hourlyRate * hWorked;
    }
}
