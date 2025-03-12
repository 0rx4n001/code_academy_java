package Quiz3.M4.M4_2;

public abstract class Employee {

   protected String name;

   public Employee(String name) {
       this.name = name;
   }

   protected abstract double calculateSalary();
}
