package Quiz4.Design_pattern.M1.M3;


public class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("MacOS checkbox-u göstərilir.");
    }

    @Override
    public void onClick() {
        System.out.println("MacOS checkbox-u seçildi.");
    }
}

