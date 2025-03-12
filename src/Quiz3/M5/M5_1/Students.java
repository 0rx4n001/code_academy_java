package Quiz3.M5.M5_1;

public class Students {
    private String  name;
    private int  id;

    static int  totalStudents = 0;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
        totalStudents++;
    }

    public void display() {
        System.out.println("Name: " + name + " ID: " + id);
    }
}
