package Quiz4.Design_pattern.M1.M3;

import java.awt.*;

public class Client {
    private Button button;
    private Checkbox checkbox;


    public Client(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

    public void clickUI() {
        button.onClick();
        checkbox.onClick();
    }
}
