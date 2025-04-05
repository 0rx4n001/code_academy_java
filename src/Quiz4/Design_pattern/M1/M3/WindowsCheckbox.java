package Quiz4.Design_pattern.M1.M3;


public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Windows checkbox-u göstərilir.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows checkbox-u seçildi.");
    }
}

