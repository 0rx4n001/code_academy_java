package ls7abstraction;

public abstract class Accounting extends Personal {
    protected int horlyWage;
    protected int mWh;
    protected int wage;

    protected abstract int horlyWage();
    protected abstract int mWh();

    protected int wage (int horlyWage, int mWh) {
    int wage = horlyWage * mWh;
    return wage;
    }
}
