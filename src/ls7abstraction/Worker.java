package ls7abstraction;

public class Worker extends Accounting{

    @Override
    protected int horlyWage() {
        return 10;
    }

    @Override
    protected int mWh() {
        return 200;
    }

    @Override
    public String toString() {
        return "Worker{" +
                " company name " + companyName+
                ", horlyWage=" + horlyWage +
                ", month worked time= "+mWh+
                ", wage=" + wage +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", finKod='" + finKod + '\'' +
                ", perId='" + perId + '\'' +
                '}';
    }
}
