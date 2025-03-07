package Quiz3.M2;

public class M2_2_employe {
    private String empName;
    private double salary;

    public M2_2_employe(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }


    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void increaseSalary(double percent) {
        if (percent > 0){
            salary += salary * (percent/100);
        }else{
            System.out.println("Faiz dəyəri müsbət olmalıdır.");
        }
    }
    public double getSalary() {
        return salary;
    }
}
