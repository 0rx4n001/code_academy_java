package quiz_10_04_2025.Custom_Exception;

public class Main {
    public static void main(String[] args) {
        int age = AgeValidator.getAgeFromUser();
        try {
            AgeValidator.checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Səhv: " + e.getMessage());
        }
    }
}

