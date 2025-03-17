package Quiz4.Design_pattern.M1.M3;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("MacOS butonu göstərilir.");
    }

    @Override
    public void onClick() {
        System.out.println("MacOS butonuna basıldı.");
    }
}
