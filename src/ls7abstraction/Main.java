package ls7abstraction;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        worker1.horlyWage=worker1.horlyWage();
        worker1.mWh=worker1.mWh();
        worker1.wage = worker1.wage(worker1.horlyWage, worker1.mWh);
        worker1.name="Orxan";
        worker1.surName="Bayramov";
        System.out.println(worker1);
    }
}
