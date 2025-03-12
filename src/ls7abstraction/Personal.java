package ls7abstraction;

public abstract class Personal {
    static final String companyName = "Baku Steel";
    static final String companyAddres = "Baku";

    protected String name = "perName";
    protected String surName = "perSurname";
    protected String finKod = "7 simvollu fin kod";
    static int perIdVar = 1000;

    protected String perId;

    protected String perId() {
        perIdVar++;
        String no = perIdVar + "";
        return no;
    }
}
