package Quiz3.M1;

public class Main {
    public static void main(String[] args) {
        M1_1_Persons person1 = new M1_1_Persons("Seymur", 25);
        person1.introduce();

        M1_2_Books book1 = new M1_2_Books("Kotlin", "Mehmet Ali", 2015 );
        book1.displayDetails();
    }
}