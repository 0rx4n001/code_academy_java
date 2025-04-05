package Quiz3.M4.M4_2;

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee emp = new FullTimeEmployee("Orxan", 3000);
        System.out.println("Tam zamanli maas "+ emp.name + emp.calculateSalary());

        PartTimeEmployee  pemp = new PartTimeEmployee("Ayten" , 30, 12);
        System.out.println("yari zamanli maas " + pemp.name + pemp.calculateSalary());
    }
}
