package Quiz4.Design_pattern.M1.M3;


public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows butonu göstərilir.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows butonuna basıldı.");
    }
}
