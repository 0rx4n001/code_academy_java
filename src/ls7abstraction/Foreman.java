package ls7abstraction;

public class Foreman extends Worker {
    @Override
    protected int mWh() {
        return 15;
    }

    @Override
    protected int horlyWage() {
        return 200;
    }
}
