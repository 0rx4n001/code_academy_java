package Quiz3.M2;

public class Main {
    public static void main(String[] args) {
        M2_1_Students st1 = new M2_1_Students("Oktay2");
        st1.setStGrade(108);
        st1.displayInfo();


        M2_2_employe emp = new M2_2_employe("Orxan", 5000);
        System.out.println("Cari maas: "+emp.getSalary());

        emp.increaseSalary(10);

        System.out.println("Yeni maas: "+emp.getSalary());
    }
}
