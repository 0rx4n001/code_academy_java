package Quiz4.Design_pattern.M1.M3;

public class Main {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Client windowsClient = new Client(windowsFactory);
        System.out.println("Windows UI:");
        windowsClient.renderUI();
        windowsClient.clickUI();

        System.out.println();

        GUIFactory macFactory = new MacOSFactory();
        Client macClient = new Client(macFactory);
        System.out.println("MacOS UI:");
        macClient.renderUI();
        macClient.clickUI();
    }
    }



