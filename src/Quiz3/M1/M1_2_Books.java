package Quiz3.M1;

public class M1_2_Books {
    String title;
    String author;
    int year;

    public M1_2_Books(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

   public void displayDetails() {
       System.out.println("==========M_2================");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
       System.out.println("==========M_2================");
   }
}
